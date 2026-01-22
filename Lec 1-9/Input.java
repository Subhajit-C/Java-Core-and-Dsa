import java.util.Scanner;
// public is an access specifier which is accessible for anyone.
//a java code should always be inside a class.
public class Input {  
    //every java program has a file name which must match the class name and every program must contain the main() method.

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  //'Scanner' keyword is to take an input.("system.in" means that the input should be taken from the terminal)

        System.out.print("Enter a string: ");   //"System.out.print(....)" is to print.  anything inside the brackets will be printed on the terminal
        //Note: println is used if you want the output to be printed on the next line. "print" is used when you want the next output to be printed on the same line.

        System.out.println(input.nextLine());   //"nextLine()" keyword is used to read the whole string from the terminal/
        


        Scanner a = new Scanner(System.in);

        System.out.print("Enter a string: ");

        System.out.println(a.next());         //"next()" keyword is used to read the 1st word of the string from the terminal



        Scanner b = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        System.out.println(b.nextInt());    //"nextInt()" is used to read the 1st interger from the terminal. If it reads a string then it gives an error
        input.close();
        a.close();
        b.close();
    }
}



//Note: In java we have to end every statement with a ";"
//every class name should be started with a capital letter.