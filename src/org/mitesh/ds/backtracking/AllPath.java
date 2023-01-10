package org.mitesh.ds.backtracking;
import java.util.*;

public class AllPath {
    public static void main(String[] args) {
        boolean [][] maze ={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        //path(0,0,maze,"");
        int[][] arr = new int[3][3];
        pathStep(0,0,maze,"",1,arr);
        //System.out.println(arr.);

    }
    static void path(int r, int c, boolean[][]maze, String p){
        if(r==maze.length-1 && c==maze[0].length -1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c] = false;
        //up
        if(r>0){
            path(r-1,c,maze,p+"u");
        }
        if(r<maze.length-1){
            path(r+1,c,maze,p+"d");
        }
        if(c>0){
            path(r,c-1,maze,p+"l");
        }
        if(c<maze[0].length -1){
            path(r,c+1,maze,p+"r");
        }
        maze[r][c]=true;
    }
    static void pathStep(int r, int c, boolean[][]maze, String p,int step,int[][]path){
        if(r==maze.length-1 && c==maze[0].length -1){
            path[r][c]=step;
            System.out.println(p);
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c] = false;
        path[r][c]=step;
        //up
        if(r>0){
            pathStep(r-1,c,maze,p+"u",step+1,path);
        }
        if(r<maze.length-1){
            pathStep(r+1,c,maze,p+"d",step+1,path);
        }
        if(c>0){
            pathStep(r,c-1,maze,p+"l",step+1,path);
        }
        if(c<maze[0].length -1){
            pathStep(r,c+1,maze,p+"r",step+1,path);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
