package Functions_and_Methods;

import java.util.Scanner;

/* 
public class Functions {
    public static void main(String[] args) {
        //Q. Take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum: "+ sum);
    }
}
*/

// we dont have to write this again and again if we want this many times. we can use functions or methods

public class Functions {
    public static void main(String[] args) {
        sum();
        
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum: "+ sum);
        in.close();
    }
}