package com.zaid;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,10,14,15,16,18,22,25,26,27,28};
        int target=28;

        int ans=findAns(arr,target);
        System.out.println(target+" lies at index: "+ans);
    }
    static int findAns(int[] arr,int target){
        int start=0,end=1;
        while(target>arr[end]){
            int newStart=end+1;
           end=end+(end-start+1)*2;
           start=newStart;
        }
        return  binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
