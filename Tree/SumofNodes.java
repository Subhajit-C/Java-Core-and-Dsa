package Tree;

public class SumofNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BT{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int sumOfAllNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum = sumOfAllNodes(root.left);
        int rightsum = sumOfAllNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BT.buildTree(nodes);

        System.out.println(sumOfAllNodes(root));
    }
}
