//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/


//An array arr is a mountain if the following properties hold:
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

//You must solve it in O(log(arr.length)) time complexity.

//Example 1:

//Input: arr = [0,1,0]
//Output: 1

package com.zaid;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
   static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;;
        while(arr[mid+1]>arr[mid] || arr[mid-1]>arr[mid]){
            mid=start+(end-start)/2;
            if(arr[mid+1]>arr[mid])
            {
                start=mid;
            }
            else if(arr[mid+1]<arr[mid]){
                end=mid;
            }
        }
        return mid;
    }
}
