package RecursionSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {3,5,2,7,4,1,8,6};
        bubble(nums, nums.length-1, 0);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] arr, int start, int index){
        if (start == 0){
            return;
        }
        if(start>index){
            if(arr[index]>arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            } 
            bubble(arr, start, index+1);
        }
        else{
            bubble(arr, start-1 , 0);
        }

    }
}
    
