package Tree.BinarySearchTree;

public class DeleteNode {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }   





    static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.val > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }





    static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }





    static Node delete(Node root, int val){
        if(root.val > val){
            root.left = delete(root.left, val);
        }
        else if(root.val < val){
            root.right = delete(root.right, val);
        }
        else{//root.val = val
            //case 1: 0 child
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2: 1 child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3: 2 child
            Node IS = inOrderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }

        return root;
    }





    public static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }




    
    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 10, 11, 14};
        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = insert(root, nodes[i]);
        }

        inorder(root);

        System.out.println();


        delete(root, 8);
        inorder(root);
    }
}
