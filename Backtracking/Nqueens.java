public class Nqueens {
    public static void main(String[] args) {
        
    }

    static int queens(boolean[][] board, int rows){
        if(rows==board.length){
            dispaly(board);
            return 1;
        }
        //placing the queen and checking for every row and col
        for(int cols =0; cols<board.length; cols++){
        
        }
        return rows;



    }

    static void dispaly(boolean[][] board){
        for(boolean[] rows: board){
            for(boolean element: rows){
                if(element){
                    System.out.println("Q ");
                }
                else{
                    System.out.println("X ");
                }
            }
            System.out.println();
        }
    }

}
