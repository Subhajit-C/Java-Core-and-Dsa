package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,22,9,35,6};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxV = arr[0];
        for (int i = 1; i < arr.length ; i++){
            if (maxV<arr[i]) {
                maxV = arr[i];
            }
        }
        return maxV;
    }
}
