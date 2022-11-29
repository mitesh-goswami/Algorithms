package org.mitesh.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//using cyclic sort
//google question
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Leetcode448 {
    public static void main(String[] args) {
        int[] nums=new int[]{4,3,2,7,8,2,3,1};
        //nums = cSort(nums);
        System.out.println(Arrays.toString(cSort(nums).toArray()));
        //return solution(nums);
    }
    static List<Integer> cSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            System.out.println("actual array element: "+ arr[i]);
            int correct = arr[i] - 1;
            System.out.println("correct: "+ correct);
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while(j<arr.length){
            if(arr[j]!=j+1){
                list.add(j+1);
            }
            j++;
        }
        return list;
        //return arr;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
