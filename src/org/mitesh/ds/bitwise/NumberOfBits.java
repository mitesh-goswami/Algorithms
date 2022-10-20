package org.mitesh.ds.bitwise;

import java.util.Scanner;

public class NumberOfBits {
    private int noOfBits(int n){
        double x = (double)n;
        return (int)Math.ceil(Math.log(x)/Math.log(new Double(2)));
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        n = in.nextInt();
        NumberOfBits obj = new NumberOfBits();
        System.out.println("Number of bits: "+ obj.noOfBits(n));
    }
}
