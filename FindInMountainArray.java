//https://leetcode.com/problems/find-in-mountain-array/description/
//Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
//Input: array = [1,2,3,4,5,3,1], target = 3
//Output: 2
//Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
//Steps followed:1.Find peak Element
//               2.Search in first half .
//               2.Search in 2nd half .
package com.zaid;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        int peakIndex = findPeakIndex(mountainArr);
        int ans1=search(mountainArr,target,peakIndex,true);
        int ans2=search(mountainArr,target,peakIndex,false);
        if(ans1==ans2)
        {
            System.out.println(ans1);
        } else if (ans1!=-1) {
            System.out.println(ans1);
        } else if (ans2!=-1) {
            System.out.println(ans2);
        }


    }
    static int search(int[] mountainArr,int target,int peakIndex,boolean isAsc)
    {
        int start,end,index;
        if(isAsc){
            start=0;
            end=peakIndex;
            index=orderAgnosticBS(mountainArr,target,start,end,isAsc);

        }else{
            start=peakIndex;
            end=mountainArr.length-1;
            index=orderAgnosticBS(mountainArr,target,start,end,isAsc);
        }
        return index;
    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end,boolean isAsc){
        int  mid;

        while(start<=end)
        {
//         mid=(start+end)/2; might exceed the range limit for int
            mid=start+(end-start)/2;//better way.
            if(arr[mid]==target) {
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target)
                {
                    end=mid-1;

                }
                else if(arr[mid]<target)
                {
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]>target)
                {
                    start=mid+1;

                }
                else if(arr[mid]<target)
                {
                    end=mid-1;
                }
            }


        }
        return -1;
    }
    static int findPeakIndex(int[] mountainArr){
        int start=0;
        int end=mountainArr.length-1;
        int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(mountainArr[mid+1]>mountainArr[mid])
            {
                start=mid+1;
            }
            else if(mountainArr[mid+1]<mountainArr[mid]){
                end=mid;
            }
        }
        return start;
    }
}
