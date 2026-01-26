package Tree;

public class CountNodes {
    static class Node{
        int data;
        Node left;
        Node right;
         
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT{
        static int idx = -1;
        
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }

    
    public static int nodeCount(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = nodeCount(root.left);
        int rightNodes = nodeCount(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BT.buildTree(nodes);

        System.out.println(nodeCount(root));
    }
}
