package RecursionSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {3,5,2,7,4,1,8,6};
        int[] arr = {12,-2,0,1,-3,6,18,-35,56,46};
        selection(nums, nums.length, 0, 0);
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int i, int index, int max){
        if (i==0){
            return;
        }
        if(i>index){
            if(arr[max]< arr[index]){
                selection(arr, i, index+1, index);
            }
            else{
                selection(arr, i, index+1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[index-1];
            arr[index-1] = temp;
            selection(arr, i-1, 0, 0);
        }
    }

}
