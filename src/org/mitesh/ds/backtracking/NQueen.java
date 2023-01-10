package org.mitesh.ds.backtracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board, 0));
    }

    static int queen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board[0].length; col++) {
            if(isSafe(board,row,col)){
                board[row][col]  = true;
                count += queen(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean [][]board,int row,int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        for(int i = 0; i<maxLeft;i++){
            if(board[row-1][col-1]){
                return false;
            }
        }
        int maxRight = Math.min(row,board[0].length-col-1);
        for (int i = 0; i < maxRight; i++) {
            if(board[row-1][col+1]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean element : arr) {
                if (element) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
