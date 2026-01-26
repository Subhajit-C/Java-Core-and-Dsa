package RecursionSorting;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,9,-1,7};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    static int[] mergesort(int[] arr){

        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0 ,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] L, int[] R){
        int[] mix = new int[L.length + R.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<L.length && j<R.length){
            if(L[i]<R[j]){
                mix[k]=L[i];
                i++;
            }
            else{
                mix[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<L.length){
            mix[k]=L[i];
            k++;
            i++;
        }

        while(j<R.length){
            mix[k]=R[j];
            k++;
            j++;
        }        
        return mix;
    } 

}
