import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();   //takes the 1st integer as an input. but if we give it any other data type like string or float it will give an error because we asked for an integer
        int num2 = input.nextInt();   //it will take the 2nd integer as an input
        int sum = num1 + num2;

        // float num1 = input.nextInt();



        System.out.println("Sum is equal to: "+ sum);
        input.close();
    }
}
