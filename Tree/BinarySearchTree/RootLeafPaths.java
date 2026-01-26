package Tree.BinarySearchTree;

import java.util.ArrayList;

public class RootLeafPaths {
    static class Node{
        int val;
        Node left;
        Node right;

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
            root.right = insert(root.right, data);
        }

        return root;
    }





    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }





    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        } 

        path.add(root.val);

        //arrived at leaf node
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{//for non leaf nodes
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + " -> ");
        }
        System.out.print("null");
        System.out.println();
    }




    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = insert(root, nodes[i]);
        }

        inorder(root);

        System.out.println();



        ArrayList<Integer> path = new ArrayList<>();
        System.out.println("All the paths: ");
        printRoot2Leaf(root, path);
    }
}
