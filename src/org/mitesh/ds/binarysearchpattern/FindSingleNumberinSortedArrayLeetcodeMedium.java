package org.mitesh.ds.binarysearchpattern;
// https://leetcode.com/problems/single-element-in-a-sorted-array/
// https://practice.geeksforgeeks.org/problems/element-appearing-once2552/1
/*
companies: Amazon, Microsoft
author: Mitesh Goswami
date: 02-12-2022
 */
//solution must run in O(log n) time and O(1) space
//can't use recursion try alternate approach
public class FindSingleNumberinSortedArrayLeetcodeMedium {
    /*
    sample input:
    19
5 5 8 8 11 11 12 12 14 14 24 27 27 28 28 31 31 45 45
Your Output:
5
Expected Output:
24
     */
    public static void main(String[] args) {
        int [] arr ={5,5,8,8,11,11,12,12,14,14,24,27,27,28,28,31,31,45,45};
        System.out.println(singleNumber2(arr,19));
    }
    /*
    logic is in sorted array if every element occurs twice
    the element in the odd index will be the 2nd occurrence of that element
    and element at even index will be the 1st occurrence of that element
    but once the element which occurs only once will come this order will change.
    so we're taking advantage of this observation.
     */
    //time complexity: O(log n) and space complexity: O(1)
    static int singleNumber2(int[]arr, int N){
        // 1 1 2 2 3 4 4
        int start = 0;
        int end = N - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            int oi;//2nd occurence
            int ei;//1st occurence
            if(mid % 2 == 0){
                //if mid is even
                if(arr[mid] == arr[mid+1]){
                    start = mid + 1;
                }
                else{
                    end = mid ;
                }
            }
            else{
                // if mid is odd
                if(arr[mid] == arr[mid - 1]){
                    start = mid + 1;
                }
                else{
                    end = mid ;
                }
            }

            //if(arr[mid])
        }
        return arr[start];
    }
//    static int singleNumber(int[]arr, int start, int end, int N){
////        while(start<=end){
////            int mid = start + (end - start)/2;
////            if(arr[mid]!= arr[mid +1]||arr[mid] != arr[mid -1]){
////                return arr[mid];
////            }
//        // int start = 0;
//        // int end = 1;
//        while(start <= end){
//            if(arr[start]!=arr[start+1]){
//                if(start>=1&&arr[start]==arr[start-1]){
//
//                }
//                else
//                    return arr[start];
//            }
//            int mid = start + (end - start)/2;
//            if(mid>start&& mid<end && arr[mid]!=arr[mid-1] && arr[mid]!= arr[mid+1]){
//                return arr[mid];
//            }
//            int x1 = singleNumber(arr,0,mid-1,N);
//            int x2 = singleNumber(arr,mid+1,N-1,N);
//            if(x1 != -1){
//                return x1;
//            }
//            if(x2!=-1){
//                return x2;
//            }
//        }
//        return -1;
//    }

}
