package Recursion;

public class ReverseTheNo {
    
/*  

    public static void main(String[] args) {
        int n = 1432;
        reverse(n);
        System.out.println(reversed);
    }

    static int reversed = 0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        reversed = reversed*10 + rem;
        reverse(n/10);
    }

*/


//  by using only recursion.

    public static void main(String[] args) {
        int n = 904857245;
        System.out.println(reverse(n));
    }

    static int reverse (int n){
        if (n%10==n){
            return n;
        }

        return (n % 10) * (int)Math.pow(10, ((int)Math.log10(n))) + reverse(n / 10);
    }

}
