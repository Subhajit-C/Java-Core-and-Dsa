package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {

    /*

    public static void main(String[] args) {
        String s = "abc";
        subseq("", s);
    }

    static void subseq(String p, String up){  //p:processed, up:unprocessed
        if(up.isEmpty()){
            System.out.println(p); //to print the subsets
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch, up.substring(1));  //take ch    
        subseq(p, up.substring(1));     //ignore ch
        //string are immutable, so it is making new object as substrings in each function call. To enhance this we can use arraylist which is mutable 
    }

    */


    /* 

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(li("", s));
    }

    static ArrayList<String> li(String p, String up){  //p:processed, up:unprocessed
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = li(p+ch, up.substring(1));  //take ch
        ArrayList<String> right = li(p, up.substring(1));     //ignore ch

        left.addAll(right);
        return left;

    }

    */

    //making subsets using iteration
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(subsets(arr));
        int[] nums = {1,2,2};
        System.out.println(subsetsDuplicate(nums));
    }

    static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for(int i = 0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    //if the arr contains repeative nos.
    static List<List<Integer>> subsetsDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;

        for(int j = 0; j<arr.length; j++){
            s = 0;
            //if the current and previous element is same
            if(j>0 && arr[j]==arr[j-1]){
                s = e+1;
            }
            e = outer.size() - 1;
            int n = outer.size();
            for(int i = s; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }

}
