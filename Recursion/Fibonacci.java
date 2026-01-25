package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            System.out.print(Fibo(i)+" ");
        }
    }
    
    static int Fibo(int n){
        
        if (n<2){
            return n;
        }
        
        return Fibo(n-1) + Fibo(n-2);
         
    }
}
