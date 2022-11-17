package org.mitesh.ds.binarysearchpattern;
//leetcode problem:1095 hard problem
public class FindInMountainArrayLeetcodeHard {
    public static void main(String[] args) {
        int[] arr= new int[]{1,5,2};
        System.out.println(arr[findPeak(arr)]);
        int peak = findPeak(arr);
        int index = ascDescBinarySearch(arr,2,0,peak);
        if(index != -1){
            System.out.println("index: "+ index);
        }
        else{
            System.out.println("index: "+ ascDescBinarySearch(arr,2,peak+1,arr.length -1));
        }
    }
    /*
    this function is used to find the peak of mountain array
    mountain array is the array which is divided into 2 parts
    in 1st part the array is in ascending order upto a peak element
    and in 2nd part the array is descending order
     */
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]> arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int ascDescBinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = false;
        int ans = -1;
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isAsc){
                if(target<arr[mid]){
                    end = mid -1;
                }
                else if(target> arr[mid]){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(target< arr[mid]){
                    start = mid + 1;
                }
                else if(target > arr[mid]){
                    end = mid;
                }
                else{
                    System.out.println("in the second half");
                    return mid;
                }
            }
        }
        return ans;
    }


}
