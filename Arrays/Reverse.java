package Arrays;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,3,22,9,35,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }   

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp;
        while (start < end) {
            for (int i=0; i<arr.length/2 ; i++){
                temp = arr[start];
                arr[start] = arr[end];
                arr [end] = temp;
                start++;
                end--;
            }

        }
        
    }
}
