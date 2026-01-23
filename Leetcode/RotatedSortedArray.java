package Leetcode;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int [] arr = {4,5,1,3};
        System.out.println(search(arr, 5));
    }
    
    static int search(int[] nums, int target) {
        int p = pivot(nums);
        
        if (p == -1){
            return BS(nums, target, 0, nums.length-1);
        }

        if (nums[p] == target){
            return p;
        }

        if (target>= nums[0]){
            return BS(nums, target, 0, p-1);
        }
        else{
            return BS(nums, target, p+1 , nums.length-1);
        }
       
    }

    static int BS(int[] arr, int target, int start, int end){
        
        while (start<=end){
            int mid = start + (end - start)/2;
            
            if (target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        
        }
        return -1;
    } 
     

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (mid<end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid>start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if (arr[mid] > arr[start]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

   

}
