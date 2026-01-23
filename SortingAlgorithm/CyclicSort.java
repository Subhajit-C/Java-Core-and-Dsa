package SortingAlgorithm;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] nums = {3,5,2,7,4,1,8,6};
        int[] arr = {5,4,3,2,1};
        cyclic(nums);
        cyclic(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
    }

}
