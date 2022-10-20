package org.mitesh.ds.bitwise;

import java.util.Scanner;

public class MagicNumber {
    private int magicNumber(int n) {
        int ans = 0;
        int base = 5;
        while (n != 0) {
            int last_bit = n & 1;
            ans = ans + (base * last_bit);
            base = base * base;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("ENter a number: ");
        n = sc.nextInt();
        MagicNumber obj = new MagicNumber();
        System.out.println("magic number : " + obj.magicNumber(n));

    }
}
