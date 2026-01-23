package BitwiseOperator;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 8;
        System.out.println(P(base, power));
    }

    static int P(int base, int power){
        int ans = 1;
        while (power > 0){
            if ((power & 1) == 1){
                ans *=base;
            }

            base *= base;
            power = power>>1;
        }
        return ans;
    }
}
