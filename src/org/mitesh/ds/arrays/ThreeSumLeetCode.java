package org.mitesh.ds.arrays;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
* author: Mitesh Goswami
* date: 19/04/23
* companies: Google , Amazon, Microsoft, facebook, Apple
* leetcode link: https://leetcode.com/problems/3sum/description/
 */
public class ThreeSumLeetCode {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        for(List<Integer> temp: ans){
            for(int x : temp){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < n && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(k > 0 && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
