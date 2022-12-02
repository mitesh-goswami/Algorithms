package org.mitesh.ds.binarysearchpattern;

import com.sun.corba.se.impl.orb.ParserTable;

public class SearchInRotatedArrayLeetCode {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int pivot = findPivot(arr);
        System.out.println("pivot: " + pivot);
        if (pivot == -1) {
            System.out.println("no pivot ");
            System.out.println(binarySearch(arr, target, 0, arr.length - 1));
        }
        if (arr[pivot] == target) {
            System.out.println(pivot);
        }
        //as the element in 2nd half will always be greater than 1st element
        if (arr[0] <= target) {
            //for 1st half
            System.out.println(binarySearch(arr, target, 0, pivot - 1));
        } else {
            System.out.println("inside 2nd half");
            System.out.println(binarySearch(arr, target, pivot + 1, arr.length - 1));
        }
    }

    //this is only for arrayy with no dupllicate value
    static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findPivotwithDuplictaes(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }
            //sorted left half
            else if (arr[start] <= arr[mid] || arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int arr[], int target, int start, int end) {
        boolean isAsc = false;
        if (arr[start] < arr[end]) {
            isAsc = true;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
