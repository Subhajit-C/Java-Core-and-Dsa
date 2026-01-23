package Leetcode;

public class ElementinMountainArr {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,12,15,16,18,14,11,9,3,1};
        int target = 9;
        int ans = search(nums, target);
        System.out.println(ans);

    }
   
    public static int search(int[] arr, int target){
        int peak = peakelement(arr);
        int firsthalf = OrderAgnosticBS(arr, target,0 , peak);
        if (firsthalf != -1){
            return firsthalf;
        }
        return OrderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    public static int peakelement(int[] arr){
        int start = 0;
        int end = arr.length -1;
        
        while (start<end){
            int mid = start + (end - start)/2;
            
            if (arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
            else {
                end = mid ;
            }
        }
        return start;
    }

    public static int OrderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){

            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                    return mid;
                }

            if (isAsc == true){
                if (target<arr[mid]){
                    end = mid -1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if (target>arr[mid]){
                    end = mid -1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;   
    }


}
