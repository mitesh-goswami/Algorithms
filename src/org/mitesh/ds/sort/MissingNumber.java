package org.mitesh.ds.sort;

public class MissingNumber {
    //Amazon's Question
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1}));
    }

    static int missingNumber(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && i != correct) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }
}
