
public class LeanearSearch {

    public static void main(String[] args) {
        int[] arr = {6,5,4,65,4,9,8,16,41,8,7};
        int target = 41;
        int ans = LS(arr ,target);
        System.out.println(ans);
    }
    
    static int LS(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        else{
            for (int i=0; i<arr.length; i++){
                if (arr[i]==target){
                    return i;
                }
            }

        }
        
        return -1;
    }

}
