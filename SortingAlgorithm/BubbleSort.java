package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {3,5,2,7,4,1,8,6};
        int[] arr = {5,4,3,2,1};
        bubble(nums);
        bubble(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        for (int i = 0; i<arr.length-1; i++){
            boolean swapped = false;
            for (int j = 1; j<arr.length ; j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
       }  
    }
}
