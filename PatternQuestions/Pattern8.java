package PatternQuestions;

public class Pattern8 {
    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n){

        for (int i = 1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print("  ");
            }

            for (int j = i; j>=1; j--){
                System.out.print(j +" ");
            }
            
            for (int k = 2; k<=i; k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }

        for (int i = 1; i<=n; i++){
            for (int k=1; k<=i; k++){
                System.out.print("  ");
            }

            for (int j = n-i; j>=1; j--){
                System.out.print(j+" ");
            }
            
            for (int k = 2; k<=n-i; k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }


    }
}
