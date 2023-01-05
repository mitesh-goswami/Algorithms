package org.mitesh.ds.sort;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] nums = {8,10,4,12,11,9};
        int[] ans = mergeSort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        int[] l = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] r = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(l,r);
    }
    static int[] merge(int[] l, int[] r){
        int i = 0, j = 0, k = 0;
        int arr[] = new int[l.length+ r.length];
        while(i<l.length && j <r.length){
            if(l[i]<r[j]){
                arr[k++] = l[i++];
            }
            else{
                arr[k++] = r[j++];
            }
        }
        while(i<l.length){
            arr[k++] = l[i++];
        }
        while(j<r.length){
            arr[k++] = r[j++];
        }
        return arr;
    }
}
