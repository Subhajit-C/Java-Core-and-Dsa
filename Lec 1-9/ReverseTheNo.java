import java.util.Scanner;

public class ReverseTheNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number you want to reverse: ");
        int n = in.nextInt();
        
        int ans = 0;
        while (n>0) {
            int rem = n%10;
            ans = ans*10 + rem;
            n = n/10;

        }

        System.out.println(ans);
        in.close();
    }
}
