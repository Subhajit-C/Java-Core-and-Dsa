package Functions_and_Methods;


public class Amrstrong {
    public static void main(String[] args) {
        
        for (int i= 100; i<1000; i++) { 
            if (isarmstrong(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isarmstrong(int n){
        int og = n;
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if (sum == og){return true;}
        return false;

         
    }

    
}
