package TRIE;

public class StartsWith {
    static Node root = new Node();

    static class Node{ 
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26]; //initialize it with the size 26 to make it easier otherwise it can be 256 for all the possible character
            //initialize the array of nodes with null
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }



    //insert 
    public static void insert(String word){     
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
                if(curr.children[idx] == null){
                //add new node
                curr.children[idx] = new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }




    //search
    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }
            if(i == key.length()-1 && node.eow == false){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }




    //solution
    public static boolean startsWith(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }

            curr = curr.children[idx];
            
        }
        return true;
    }




    public static void main(String[] args) {
        String[] words = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
