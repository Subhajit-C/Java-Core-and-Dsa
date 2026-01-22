package PatternQuestions;

public class Pattern9 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        int og =n;
        n=2*n-2;
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=n ; j++){
                int index = og - Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(index + "  ");
        
            }
        System.out.println();
        }
    }
}
