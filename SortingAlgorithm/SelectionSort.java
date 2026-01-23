package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {3,5,2,7,4,1,8,6};
        int[] arr = {12,-2,0,1,-3,6,18,-35,56,46};
        selection(nums);
        selection(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i< arr.length-1; i++){
            int minIndex = i;

            for (int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex]= temp;
            }
        }
    }
}
