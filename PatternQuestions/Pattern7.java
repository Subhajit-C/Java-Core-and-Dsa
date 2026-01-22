package PatternQuestions;

public class Pattern7 {
    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n){

        for (int i = 1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");
            }

            for (int j = i; j>=1; j--){
                System.out.print(j);
            }
            
            for (int k = 2; k<=i; k++){
                System.out.print(k);
            }

            System.out.println();
        }

    }
}
