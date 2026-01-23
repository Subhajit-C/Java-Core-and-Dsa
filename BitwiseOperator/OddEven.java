package BitwiseOperator;

public class OddEven {
    public static void main(String[] args) {
        int n = 76;
        int m = 57;
        System.out.println(IsOdd(n));
        System.out.println(IsOdd(m));

    }

    static boolean IsOdd(int n){
        return (n & 1) == 1;
    }
}
// 1001110 & 1 will give (1001110 & 0000001 = 0000000) which is even.
// 1001110 & 1 will give (1001101 & 0000001 = 0000001) which is odd.