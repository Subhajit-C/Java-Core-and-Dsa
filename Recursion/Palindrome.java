package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n =1233443321;
        System.out.println(palindrome(n));
    }

    static int reverse (int n){
        if (n%10==n){
            return n;
        }

        return (n % 10) * (int)Math.pow(10, ((int)Math.log10(n))) + reverse(n / 10);
    }

    static boolean palindrome(int n){
        if (reverse(n) == n){
            return true;
        }
        return false;
    }

}
