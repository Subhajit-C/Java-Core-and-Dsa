import java.util.ArrayList;
import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        System.out.println(Maze("", maze, 0, 0));
        int[][] path = new int[maze.length][maze[0].length];
        MazeSteps("", maze, 0, 0, path, 1);
    }

    static ArrayList<String> Maze(String p, boolean[][] maze, int rows, int cols){
        if (rows==maze.length - 1 && cols==maze[0].length -1){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(maze[rows][cols]==false){
            return new ArrayList<>();
        }

        maze[rows][cols] = false;
        ArrayList <String> list = new ArrayList<>();

        // if(rows<maze.length-1 && cols<maze[0].length-1){
        //     list.addAll(Maze(p+ "d", maze, rows+1, cols+1));
        // }

        if(rows>0){
            list.addAll(Maze(p+ "U", maze, rows-1, cols));
        }

        if(cols>0){
            list.addAll(Maze(p+ "L", maze, rows, cols-1));
        }

        if(rows<maze.length-1){
            list.addAll(Maze(p+ "D", maze, rows+1, cols));
        }

        if(cols<maze[0].length-1 ){
            list.addAll(Maze(p+ "R", maze, rows, cols+1));
        }

        
        maze[rows][cols] = true;

        return list;
    }

    static void MazeSteps(String p, boolean[][] maze, int rows, int cols, int[][]path, int step){
        if (rows==maze.length - 1 && cols==maze[0].length -1){
             path[rows][cols] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(maze[rows][cols]==false){
            return ;
        }

        maze[rows][cols] = false;
        path[rows][cols] = step;


        if(rows>0){
            MazeSteps(p+ "U", maze, rows-1, cols, path ,step+1);
        }

        if(cols>0){
            MazeSteps(p+ "L", maze, rows, cols-1, path , step+1);
        }

        if(rows<maze.length-1){
            MazeSteps(p+ "D", maze, rows+1, cols, path , step+1);
        }

        if(cols<maze[0].length-1 ){
            MazeSteps(p+ "R", maze, rows, cols+1, path , step+1);
        }

        
        maze[rows][cols] = true;
        path[rows][cols] = 0;

       
    }
}
