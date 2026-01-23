
public class OrderAgnostisBS {
    public static void main(String[] args) {
        int[] arr = {-55, -45, -29, - 10, 3, 4, 14, 45, 67, 99};
        int[] nums = {110, 101, 99, 90, 80, 66, 15, 0, -15, -57, -99};
        int target = 99;
        int ans= OrderAgnostisSearch(arr, target);
        int ans2 = OrderAgnostisSearch(nums, target);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static int OrderAgnostisSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start]<arr[end];


        while (start<=end){
            int mid = start + (end - start)/2;
            
            if (arr[mid] == target){
                return mid;
            }

            if (isAsc == true){
                if (target > arr[mid]){
                    start = mid+1;
                } else if(target < arr[mid]){
                    end = mid-1;
                }
            }
            else {
                if (target < arr[mid]){
                    start = mid+1;
                } else if(target > arr[mid]){
                    end = mid-1;
                }
            }
            
        
        }
        return -1;
    }
}
