//----------Ceiling:Find the smallest number in the array >= target element.
//Steps:1.Identify target element.
//2.Find all numbers >=target.
//3.The smallest number among those is the ceiling.

package com.zaid;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,3,9,14,16,18};
        int target=15;
        int ans;

        ans=ceiling(arr,target);
        System.out.println(ans);

    }
    static int ceiling(int[] arr,int target){
        int start,end,mid;
        start=0;
        end=arr.length-1;

        while(start<=end)
        {
            mid=start+(end-start)/2;//better way.
            if(arr[mid]>target)
            {
                end=mid-1;

            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }

        return arr[start];
    }

}
