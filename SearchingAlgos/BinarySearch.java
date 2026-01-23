public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-55, -45, -29, - 10, 3, 4, 14, 45, 67, 99};
        int target = 99;
        int ans= BS(arr, target);
        System.out.println(ans);
    }

    static int BS(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;

        while (start<=end){
            int mid = start + (end - start)/2;
            
            if (target > nums[mid]){
                start = mid+1;
            } else if(target < nums[mid]){
                end = mid-1;
            } else{
                return mid;
            }
        
        }
        return -1;
        
    }
}
