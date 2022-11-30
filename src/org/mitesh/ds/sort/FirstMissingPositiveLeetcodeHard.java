package org.mitesh.ds.sort;
// https://leetcode.com/problems/first-missing-positive/
//companies: Amazon, samsung, snapdeal
//leetcode hard gfg medium
/*
author: mitesh goswami
topic: cycle sort
date: 30/11/2022
 */
public class FirstMissingPositiveLeetcodeHard {
    public static void main(String[] args) {
        /*
        [3,4,-1,1]
        [7,8,9,11,12]
         */
        int[] arr = new int[]{3,4,-1,1};
        System.out.println(smallestPositive(arr));
    }
    static int smallestPositive(int[] arr){
        int i=0;
        //applying cycle sort
        while(i<arr.length){
            int correctIndex = arr[i] - 1;//coz we're starting our range from 1
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!= arr[correctIndex]){
                //ignoring negative element and elements which are grater than size of array
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j]-1 != j){
                return j+1;
            }
        }
        return arr.length +1;//base case returning the max element +1(if all elemnets are already in range 1 to n then n+1
    }
    static void swap(int[]arr, int i, int correct){
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }
}
