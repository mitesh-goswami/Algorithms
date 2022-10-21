package org.mitesh.ds.bitwise;
import java.util.*;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        boolean ans = true;
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("enter number to check weather its power of two: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println("the number is power of two: "+ obj.isPowerOfTwo(input));
    }
}
