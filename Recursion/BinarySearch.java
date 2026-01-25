package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-55, -45, -29, - 10, 3, 4, 14, 45, 67, 99};
        int target = -55;
        int ans = BS(nums, target, 0 , nums.length-1);
        System.out.println(ans);
    }

    static int BS(int[] arr, int key, int start, int end){

        while (start<=end){
            int mid = start + (end - start)/2;
            if (key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                end = mid -1;
                return BS(arr, key, start, end);
            }
            else{
                start = mid+1;
                return BS(arr, key, start, end);
            }
        }
        
        return -1;
    }
}
