package org.mitesh.ds.bitwise;

import java.util.Scanner;

public class BinaryExponent {
    public int binaryExponent(int base, int power) {
        int ans = 1;
        while (power != 0) {
            if ((power & 1) == 1) {
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("enter base for binary exponent: ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.println("enter power for binary exponent: ");
        int power = scanner.nextInt();
        BinaryExponent binaryExp = new BinaryExponent();
        System.out.println(" the result is: " + binaryExp.binaryExponent(base, power));
    }
}
