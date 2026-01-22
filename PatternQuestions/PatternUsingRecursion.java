package PatternQuestions;

public class PatternUsingRecursion {
    public static void main(String[] args) {
        triangle(5);;
    }

    //helper function
    static void triangle(int n){
        pattern(n, 0);
    }

    
    static void pattern(int r, int c){
        if (r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            pattern(r, c+1);
        }
        else{
            System.out.println();
            pattern(r-1, 0);
        }
    }

}
