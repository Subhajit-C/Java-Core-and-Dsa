package PatternQuestions;

public class Pattern4 {
    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n){
        for (int i = 1; i<=n; i++){
            // int a =1;
            for (int j = 1; j<=i; j++){
                // System.out.print(a+ " ");
                // a+=1;
                // or
                System.out.print(j + " ");
                
            }
            System.out.println();
        }
    }
}
