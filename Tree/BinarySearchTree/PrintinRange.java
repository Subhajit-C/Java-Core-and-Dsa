package Tree.BinarySearchTree;

public class PrintinRange {
    static class Node{
        int val;
        Node left;
        Node rigth;

        Node(int val){
            this.val = val;
        }
    }





    public static Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.val > data){
            root.left = insert(root.left, data);
        }
        else{
            root.rigth = insert(root.rigth, data);
        }

        return root;
    }




    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.rigth);

    }




    public static void printRange(Node root, int l, int r){
        if(root == null){
            return;
        }

        if(root.val >= l && root.val <= r){
            printRange(root.left, l, r);
            System.out.print(root.val + " ");
            printRange(root.rigth, l, r);
        }
        else if(root.val >= r){
            printRange(root.left, l, r);
        }
        else{
            printRange(root.rigth, l, r);
        }
    }



    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 10, 11, 14};
        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = insert(root, nodes[i]);
        }

        inorder(root);

        System.out.println();

        printRange(root, 4, 10);
    }
}
