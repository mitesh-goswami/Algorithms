package org.mitesh.ds.sort;
import java.util.*;

public class QuickSorting {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = arr[mid];
        while(start <= end){
            while(arr[start]< pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
}
