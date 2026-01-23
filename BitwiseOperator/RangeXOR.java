package BitwiseOperator;

public class RangeXOR {
    public static void main(String[] args) {
        System.out.println(XOR(999,10000));
    }

    static int Cal(int a){
        
        if (a%4==0){
            return a;
        }
        if (a%4==1){
            return 1;
        }
        if (a%4==2){
            return a+1;
        }
        return 0;     
    }

    static int XOR(int start, int end){
        return Cal(start-1) ^ Cal(end);
    }

}
