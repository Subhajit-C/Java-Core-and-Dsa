
import java.util.Arrays;

public class Searchingin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 22}
        };
        int target = 22;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
/* 
    static boolean search(int[][] arr, int target){
        if (arr.length==0){
            return false;
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (target == arr[i][j]){
                    return true;
                }
            }

        }
        return false;
    }
*/


    static int[] search(int[][] arr, int target){
        if (arr.length==0){
            return null;
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (target == arr[i][j]){
                    return new int[] {i+1, j+1 };
                }
            }

        }
        return null;
    }
}