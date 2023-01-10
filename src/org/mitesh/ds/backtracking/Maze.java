package org.mitesh.ds.backtracking;
import java.util.*;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(pathCount(3,3));
        //path(3,3,"");
//        pathDiagonal(3,3,"");
//        System.out.println(pathRet(3,3,"",new ArrayList<String> ()));
        boolean [][] maze ={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestriction(0,0,"",maze);
    }
    static int pathCount(int r, int c){
        if(r==1 || c==1){
            //System.out.println();
            return 1;
        }
        int left = pathCount(r-1,c);
        int right = pathCount(r,c-1);
        return left +right;
    }
    static void path(int r, int c, String p){
        if(r==1 || c==1){
            System.out.println(p);
            return;
        }
        if(r>1)
            path(r-1,c,p+"d");
        if(c>1)
            path(r,c-1,p+"r");

    }
    static List<String> pathRet(int r, int c, String p,ArrayList<String> list){
        if(r==1 || c==1){
            list.add(p);
            return list;
        }
        if(r>1){
            pathRet(r-1,c,p+"d",list);
        }
        if(c>1){
            pathRet(r,c-1,p+"r", list);
        }
        return list;
    }
    static void pathDiagonal(int r, int c, String p){
        if(r==1 || c==1){
            System.out.println(p);
            return;
        }
        if(r>1)
            pathDiagonal(r-1,c,p+"v");
        if(c>1)
            pathDiagonal(r,c-1,p+"h");
        if(r>1 && c>1){
            pathDiagonal(r-1,c-1,p+"d");
        }
    }
    static void pathRestriction(int r, int c, String p, boolean[][]maze){
        if(r==maze.length -1 && c==maze[0].length -1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length -1){
            pathRestriction(r+1,c,p+"d",maze);
        }
        if(c<maze[0].length -1){
            pathRestriction(r,c+1,p+"r", maze);
        }
    }
}
