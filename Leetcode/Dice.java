package Leetcode;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        //problem statement: combinations of getting an integer up(4) while throwing one or more dice.
        combinations("", 4);
        System.out.println(combinationsinList("", 4));
    }

    static void combinations(String p, int up){
        if(up==0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<=6 && i<=up ; i++){
            combinations(p+i, up-i);
        }
    }

    static ArrayList<String> combinationsinList(String p, int up){
        if(up==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<=6 && i<=up ; i++){
            list.addAll(combinationsinList(p+i, up-i));
        }
        return list;
    }

}
