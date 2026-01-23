package Leetcode;

import java.util.ArrayList;

public class Permutation {

/* 
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        permutation("", "abc", li);
        System.out.println("Total no of permutations: " + li.size());
    }


    static void permutation(String p, String up, ArrayList<String> li){
        if(up.isEmpty()){
            System.out.println(p);
            li.add(p);
            return;
        }
    
        char ch = up.charAt(0);

        for(int i = 0; i<=p.length(); i++){
            String f= p.substring(0,i);
            String e= p.substring(i, p.length());
            permutation(f+ch+e, up.substring(1), li);
        }
        
    }

*/

    public static void main(String[] args) {
        System.out.println(permutationList("", "abcd"));
    }

    //store it in an ArrayList
    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
    
        char ch = up.charAt(0);

        for(int i = 0; i<=p.length(); i++){
            String f= p.substring(0,i);
            String e= p.substring(i, p.length());
            ans.addAll(permutationList(f+ch+e, up.substring(1)));
        }

        return ans;
        
    }

}
