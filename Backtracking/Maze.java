import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println("The total no. of way to reach the target is if we can only move right and down: " + Count(3, 3));
        paths("", 3, 3);
        System.out.println("Ways: " + pathsList("", 3, 3));
        System.out.println("Ways(Diagonal included): " + pathsDiaList("", 3, 3));
        boolean[][] Maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        System.out.println(restrictedMaze("", Maze, 0, 0));
    }



    //function to count no of ways to reach for top left(1,1) to bottom right(m,n) of a m*n matrix
    //you can only move DOWN AND RIGHT
    static int Count(int rows, int cols){
        if (rows==1 || cols == 1){
            return 1;
            //only one way to reach the target when either row or col is at the extreme of the matrix
        }

        int left = Count(rows - 1, cols);
        int right = Count(rows, cols-1);

        return left + right;
        
    }



    //function to return the paths from (1,1) to (m,n)
    static void paths(String p, int rows, int cols){
        if (rows == 1 && cols == 1){
            System.out.println(p);
            return;
        }

        if (rows>1){
            paths(p + "R", rows-1, cols);   //R: right
        }
        
        if (cols>1){
            paths(p + "D", rows, cols-1);   //D: down
        }
    }



    //return the ways in a list
    static ArrayList<String> pathsList(String p, int rows, int cols){
        if (rows == 1 && cols == 1){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList <String> list = new ArrayList<>();
        if (rows>1){
            list.addAll(pathsList(p + "R", rows-1, cols));   //R: right
        }
        
        if (cols>1){
            list.addAll(pathsList(p + "D", rows, cols-1));   //D: down
        }

        return list;
    }



    //if we can also go d:diagonally
    static ArrayList<String> pathsDiaList(String p, int rows, int cols){
        if (rows == 1 && cols == 1){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList <String> list = new ArrayList<>();

        if (rows>1 && cols>1){
            list.addAll(pathsDiaList(p + "d", rows-1, cols-1));
        }

        if (rows>1){
            list.addAll(pathsDiaList(p + "R", rows-1, cols));   //R: right
        }
        
        if (cols>1){
            list.addAll(pathsDiaList(p + "D", rows, cols-1));   //D: down
        }

        return list;
    }

    
    
    //If the maze is ristricted. ie if we can travel through one or more blocks
    static ArrayList<String> restrictedMaze(String p, boolean[][] Maze, int rows, int cols){
        if(rows==Maze.length-1 && cols==Maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (Maze[rows][cols] == false){
            return new ArrayList<>();
        }

        ArrayList <String> list = new ArrayList<>();
        if(rows < Maze.length-1 && cols < Maze[0].length-1){
            list.addAll(restrictedMaze(p + "d", Maze, rows+1 , cols+1));
        }

        if(rows < Maze.length-1){
            list.addAll(restrictedMaze(p + "R", Maze, rows+1, cols));
        }

        if (cols < Maze[0].length-1){
            list.addAll(restrictedMaze(p + "D", Maze, rows, cols+1));
        }

        return list;
        
    }
}
