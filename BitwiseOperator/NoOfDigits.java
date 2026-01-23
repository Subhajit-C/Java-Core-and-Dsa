package BitwiseOperator;

public class NoOfDigits{
    public static void main(String[] args) {
        // int a = 45234523;
        // int base = 10;    //for integer

        int a = 30;
        int base = 2; //for binary
 
        int ans = (int)((Math.log(a)/Math.log(base))+1);
        System.out.println(ans);
    }
}