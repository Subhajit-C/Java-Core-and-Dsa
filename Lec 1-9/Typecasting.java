import java.util.Scanner;

public class Typecasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();      //can take a float as well as an integer as an input, the output will be a float.
        int num2 = input.nextInt();        // can only take int as an input and not a float
       
        /* 
        for automatic typecasting,
        1. the two data types should be compatible ie. the one we are asking for in the code and the one we are giving as an input.
        2. the destination type should be greater than the source type ie, LHS should be greater than the RHS. The data type we are asking for should be greater than the input. (float data type is greater the int data type, string > char)
        */

        // int num = int(67.56);

        System.out.println(num);
        System.out.println(num2);

        input.close();
    }
}