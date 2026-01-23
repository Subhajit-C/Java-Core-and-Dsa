package BitwiseOperator;

public class NoofSetBits {
    //Problem statement: given a no. find the occurance of 1 bit in that no.
    public static void main(String[] args) {
        int n = 4545;
        System.out.println(Integer.toBinaryString(n));   //returns the binary form of an integer and make it to string
        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int count = 0;

        /* method 1

        while (n>0){
            if ((n & 1) == 1){
                count ++;   
            }
            n = n>>1;
        }

        */


        /* method 2

        while (n>0){
            count++;
            n = n & (n-1);
        }

        */

        //method 3
        while(n>0){
            count++;
            n -= (n & -n);
        }


        return count;
    }
}
