package BitwiseOperator;

public class MagicNo{
    public static void main(String[] args) {
        int n = 6;
        int num = 0;
        int base = 5;

        while (n > 0) {
            int i = n & 1;
            n = (n >> 1);
            num += i * base;
            base = base * 5;
        }

        System.out.println(num);
    }

}
