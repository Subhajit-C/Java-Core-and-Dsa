package BitwiseOperator;

public class FindUniqueElement {
    //Problem statement: given an arr. all the elements in that arr are repeated twice (ie. frequency = 2) except for one no. Find that one number whose frequency is 1.
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,3,4,5,2,5,8};
        System.out.println(ans(arr));

    }
    
    static int ans(int[] arr){
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            sum ^= arr[i];
        }
        return sum;
    }
    //Logic: this function XOR's all the nos in the arr in binary. the XOR of same nos. will be 0 and the unique no will get XOR with 0 (0101 ^ 0 = 0101) which is equal to the unique element itself.
    
}
