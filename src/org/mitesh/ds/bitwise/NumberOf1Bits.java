package org.mitesh.ds.bitwise;

import java.util.Scanner;

public class NumberOf1Bits {
    public int numberOfSetBitsLogMethod(int n){
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count ++;
        }
        return count;
    }
    public int bruteForceMethodNoOfSetBits(int n){
        int count = 0;
        while(n!=0){
            if((n&1)==1){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(" enter number for input: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        NumberOf1Bits obj = new NumberOf1Bits();
        System.out.println("number of set bits in given number is: "+ obj.bruteForceMethodNoOfSetBits(input));
        System.out.println("number of set bits in given number is(using log complexity): "+ obj.numberOfSetBitsLogMethod(input));
    }
}
