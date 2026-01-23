package Leetcode;

import java.util.Arrays;

public class BSin2Dsorted {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 2)));
    }

    static int[] search(int[][] arr, int target){
        int r = arr.length;
        int c = arr[0].length -1;

        while (r<arr.length && c>=0){
            int mid = r + (c-r)/2;
            if (target == arr[r][c]){
                return new int[]{r, c};
            }

            if (target < arr[r][mid]){
                r = mid + 1;
            }
            else{
                c = mid - 1;
            }

        }

        return new int[]{-1,-1};
    }
}
