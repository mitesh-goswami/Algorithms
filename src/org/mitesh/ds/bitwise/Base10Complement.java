package org.mitesh.ds.bitwise;

import java.util.Scanner;

public class Base10Complement {
    public int complement(int n) {
        int mask = 0;
        int temp = n;
        while (temp != 0) {
            mask = mask << 1;
            mask = mask | 1;
            temp = temp >> 1;
        }

        return mask & (~n);
    }

    public static void main(String[] args) {
        System.out.println("enter number for input: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Base10Complement obj = new Base10Complement();
        System.out.println("base 10 complement of given number is : " + obj.complement(n));
    }
}
