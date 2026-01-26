package Tree;

public class DiameterOfTree {
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

    // public static int height(Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int leftheight = height(root.left);
    //     int rightheight = height(root.right);

    //     return Math.max(leftheight,rightheight) + 1;
    // }


    // //Approach 1: O(n^2)
    // public static int diameter1(Node root){
    //     if(root==null){
    //         return 0;
    //     }

    //     int diaLeft = diameter1(root.left);
    //     int diaRight = diameter1 (root.right);
    //     int dia = height(root.left) + height(root.right) + 1;

    //     return Math.max(dia, Math.max(diaRight, diaLeft));
    // }






    //Apporach 2: O(n)
    //calculation height and diameter consecutively by using a class which has two arguments, because a function cant have 2 different return types
    static class TreeInfo{
        int h;
        int dia;

        TreeInfo(int h, int dia){
            this.h = h;
            this.dia = dia;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.h, right.h) + 1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.h + right.h + 1;

        int mydia = Math.max(dia3, Math.max(dia1, dia2));

        TreeInfo myInfo = new TreeInfo(myHeight, mydia);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Node root = BT.buildTree(nodes);

        // System.out.println(diameter1(root));

        Node root = BT.buildTree(nodes);
        System.out.println(diameter2(root).dia);
    }
}
