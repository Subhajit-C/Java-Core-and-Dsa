package BitwiseOperator;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 256;
        int m = 456;
        
        System.out.println(ans(n));
        System.out.println(ans(m));
        System.out.println(ans(0));
    }   
    static boolean ans(int n){
        if (n==0){
            return false;
        }
        return (n & (n-1)) == 0;
    }
}
