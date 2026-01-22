import java.util.Scanner;

public class NoOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Enter the digit you want to find the count of: ");
        int a = in.nextInt();
        int count = 0;

        while (n>0) { 
            int rem = n%10;
            if (rem == a) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
        
        in.close();

    }
}
