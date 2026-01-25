package RecursionArray;

import java.util.ArrayList;

public class FindElement {


    /* 

    public static void main(String[] args) {
        int[] arr = {1,8,23,6,3,97,4};
        int target = 97;
        System.out.println(search(arr, target, 0));
    }

    static int search(int[] arr, int target, int index){
        if(arr.length==0 || index==arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return search(arr, target, index+1);
    }

    */


//if the target element is more than one. return a list in which it will give the indeices of the target element

    /* 

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,4,6,8,4};
        int target = 4;
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println(search(arr, target, target, list));
    }

    static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList <Integer> list){
        // Note: we have to take the list as an argument and cannot make a new list in the function because when the function calls itself again and again the value in the list will not get updated on the next function call, the next fucntion call will make its new list with 0 values and this will have for every function call.
        if (arr.length == 0 || index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return search(arr, target, index+1, list);
    }

    */

    //solution for the problem in note 1: the function is making a new object list in every function call. before returning the list it makes a new list which contains the returning list of the below fucntion calls. so it sums up the list 
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,6,8,4};
        int target = 4;
        System.out.println(search(arr, target, 0));
    }

    static ArrayList<Integer> search(int[] arr, int target, int index){
        ArrayList <Integer> list = new ArrayList<>();
        if (arr.length==0 || index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList <Integer> ansFromBelowCalls = search(arr, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

}
