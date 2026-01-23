package Leetcode;

public class EvenNoDigits {

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++){
            String j = Integer.toString(nums[i]);
            if (j.length()%2 == 0){
                count++;
            }
        }
        return count;

    }

    
}
