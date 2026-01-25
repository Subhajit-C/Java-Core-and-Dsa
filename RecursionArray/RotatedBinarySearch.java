package RecursionArray;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2};
        int target = 2;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end){

        //dont use while loop in recursion 
        if(start>end){
            return -1;
        }
        
        int mid = start + (end - start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if(arr[mid]>=arr[start]){
            if(target >= arr[start] && target <= arr[mid]){
                return search(arr, target, start, mid-1);
            }
            else{
                start = mid+1;
                return search(arr, target, mid+1, end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return search(arr, target, mid+1, end);
        }
        else{
            return search(arr, target, start, mid -1);
        }
    }

}
