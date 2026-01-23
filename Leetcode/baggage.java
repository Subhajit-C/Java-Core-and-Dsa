package Leetcode;

import java.util.*;
public class baggage {
    public static void main(String args){
        
        int n = 50;
        int k = 6;
        int[] arr = new int[k];
        int turn = 0;
        while(n>0){
            for(int i=0; i<k;i++){
                if(n>(turn*k)+i+1){
                    arr[i] += (turn*k)+i+1;
                    n -= (turn*k)+i+1;
                }
                else{
                    arr[i] += n;
                    n = 0;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
