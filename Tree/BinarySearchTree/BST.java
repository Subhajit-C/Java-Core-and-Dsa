package Tree.BinarySearchTree;

//considering there is no duplicates
public class BST {
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





    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }



    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data < key){
            return search(root.right, key);
        }
        else{
            return true;
        }

    }



    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }




    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 10, 11, 14};
        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = insert(root, nodes[i]);
        }

        inorder(root);

        System.out.println();
        System.out.println(search(root, 6));
    }
}
