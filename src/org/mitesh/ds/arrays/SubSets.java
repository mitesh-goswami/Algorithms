package org.mitesh.ds.arrays;
import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        ans = subSet(arr);
        for(List<Integer> num: ans){
            System.out.println(num);
        }
    }
    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for(int i = 0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
//    static List<List<Integer>> subSetRec (int[] arr) {
//
//    }
//    static List<List<Integer>> helper(int[] arr, int p, int up, List<List<Integer>> list){
//        if(up == arr.length -1){
//
//        }
//    }
}
