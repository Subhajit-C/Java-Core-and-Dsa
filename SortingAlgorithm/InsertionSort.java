package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {3,5,2,7,4,1,8,6};
        int[] arr = {5,4,3,2,1};
        insertion(nums);
        insertion(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr){
        for (int i = 0; i<arr.length - 1; i++){
            for (int j = i+1; j>0 ; j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                else{
                    break;
                }
                
            }
        }
    }

}
    
    
