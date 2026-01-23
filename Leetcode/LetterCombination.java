package Leetcode;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        pad("", "23");
        System.out.println(padinArray("", "23"));
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int c = up.charAt(0) - '0';
        for (int i = (c-1)*3; i<c*3; i++){
            char ch = (char)('a' + i);
            pad(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> padinArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> li = new ArrayList<>();
        int c = up.charAt(0) - '0';
        for (int i = (c-1)*3; i<c*3; i++){
            char ch = (char)('a' + i);
            li.addAll(padinArray(p+ch, up.substring(1)));
        }
        return li;
    }

}
