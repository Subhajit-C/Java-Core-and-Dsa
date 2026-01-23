package Leetcode;

public class isPrime {

    //Optimized way
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        System.out.println(primes[0]);
        Seive(n, primes);
    }

    // Seive of Eratosthenes
    static void Seive(int n, boolean[] prime){
        for (int i = 2; i*i<=n; i++){
            if (!prime[i]){
                for (int j = i*2; j<=n; j+=i){
                    prime[j]= true ;
                }
            }

        }
        for (int i =2; i<=n; i++){
            if (!prime[i]){
                System.out.print(i + " ");
            }
        }
    }


/* 

    public static void main(String[] args) {
        int n = 20;
        for (int i=1; i<=n; i++){
            System.out.println(i + " " + Prime(i));
        }   
    }

    static boolean Prime(int n){
        if (n<=1){
            return false;
        }
        int i =2;
        while (i*i<=n){
            if (n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

*/

}

