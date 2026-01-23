package Leetcode;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 100;
        factors(n);
    }

    static void factors(int n){
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i<=Math.sqrt(n); i++){
            if (n%i==0){
                if (n/i==i){
                    System.out.println(i);
                }
                else{
                    System.out.println(i + " ");
                    num.add(n/i);
                }
            }
        }
        for (int i = num.size() -1; i>=0; i--){
            System.out.println(num.get(i));
        }
    }

}
