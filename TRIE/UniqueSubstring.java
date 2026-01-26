package TRIE;

public class UniqueSubstring {
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
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        
        return count + 1;
    }




    public static void main(String[] args) {
        String str = "ababa";
        
        //find all suffixes of the string and insert them in a trie
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
}
