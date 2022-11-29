package org.mitesh.ds.sort;
import java.util.*;
//https://leetcode.com/problems/find-all-duplicates-in-an-array
// companies: amazon, DE Shaw, paytm, flipkart
public class Leetcode442MediumFindAllDuplicates {
    public static void main(String[] args) {
//        4
//        0 3 1 2
        int arr[] = new int[]{4,3,2,7,7,2,3,1};
        System.out.println(Arrays.toString(solution(arr,8).toArray()));
    }
    static ArrayList<Integer> solution(int arr[], int n){
        int i = 0;
        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        //System.out.println(Arrays.toString(arr));
        ArrayList<Integer> ans = new ArrayList<>();
        //Set<Integer> set = new TreeSet<>();
        for(int j=0; j<n;j++){
            if(arr[j]-1!=j){
                //set.add(arr[j]);
                ans.add(arr[j]);
//                int position = Collections.binarySearch(ans, arr[j]);
//                ans.add(position < 0 ? -position - 1 : position, arr[j]);

            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
    static void swap2(ArrayList<Integer>ans, int i, int correct) {
        int temp = ans.get(i);
//        ans.get(i) = ans.get(correct);
//        ans.get(correct) = temp;
        ans.set(i,ans.get(correct));
        ans.set(correct, temp);
    }


}
