package org.mitesh.ds.binarysearchpattern;

import java.util.Arrays;

public class RowColSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }
    static int [] search(int [][]arr, int target){
        //for nxn matrix
        int row = 0;
        int col = arr.length -1;
        while(row<arr.length && col >=0){
            System.out.println("row: "+ row+" col: "+ col);
            if(target == arr[row][col]){
                return new int[]{row,col};
            }
            else if(target < arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
