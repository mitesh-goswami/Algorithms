package org.mitesh.ds.binarysearchpattern;

public class SplitArrayLeetcodeHard {
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{7,2,5,10,8},2));
        System.out.println(splitArray(new int[]{1,2,3,4,5},1));
    }
    static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;
        for(int num:arr){
            start = Math.max(start,num);
            end = end + num;
        }
        while(start< end){
            int sum =0;
            int piecies =1;
            System.out.println("start: "+ start+" end: "+end);
            int mid = start + (end - start)/2;
            System.out.println("mid: "+ mid);
            for(int i:arr){
                if((sum + i)>mid){
                    sum = i;
                    piecies++;
                }
                else{
                    sum +=i;
                }
            }
            System.out.println("piecies: "+ piecies);
            if(piecies <= m){
                //this means we couuld increase the number of piecies
                //which means the the total sum would decrease
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return end;
    }
}
