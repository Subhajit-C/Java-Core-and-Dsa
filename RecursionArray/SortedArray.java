package RecursionArray;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(helper(arr));
    }

    static boolean IsSorted(int[] arr, int i){
        if(arr.length==0){
            return false;
        }
        if(i+1==arr.length){
            return true;
        }
        return (arr[i]<arr[i+1]) && IsSorted(arr, i+1);
    }
    static boolean helper(int[] arr){
        return IsSorted(arr, 0);
    }

}
