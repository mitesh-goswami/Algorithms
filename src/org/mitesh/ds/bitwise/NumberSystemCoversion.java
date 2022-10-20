package org.mitesh.ds.bitwise;

import java.util.*;
import java.lang.*;

public class NumberSystemCoversion {
    public int binaryToDecimal(int n) {
        int temp = n;
        int ans = 0;
        int base = 1;
        while (n != 0) {
            int last_bit = n % 10;
            //System.out.println("last bit: "+ last_bit);
            ans = ans + last_bit * base;
            //System.out.println("ans: " + ans);
            base = base * 2;
            n = n / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number for binary to decimal conversion: ");
        int bin = scanner.nextInt();
        NumberSystemCoversion obj = new NumberSystemCoversion();
        System.out.println("binary to decimal of given number is: " + obj.binaryToDecimal(bin));
    }
}
