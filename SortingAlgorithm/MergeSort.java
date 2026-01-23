package SortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,9,-1,7};
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int s, int e){
        if (e-s == 1){
            return;
        }
        
        int mid = s+(e-s)/2;

        mergesort(arr, s, mid);
        mergesort(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[]arr, int s, int mid, int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l =0; l<mix.length; l++){
            arr[s+l] = mix[l];
        }
    }

}
