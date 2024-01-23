//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].

//You must write an algorithm with O(log n) runtime complexity.

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
package com.zaid;

import java.util.Arrays;

public class FirstLastElement {
    public static void main(String[] args) {
        int[] arr={1};
        int target=1;
        System.out.println(Arrays.toString(findIndices(arr,target)) );

    }
    static int[] findIndices(int[] nums,int target){
        int start,end,mid;
        start=0;
        end=nums.length-1;

        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]<target){

                start=mid+1;
            } else if (nums[mid]>target) {

                end=mid-1;
            }else{
                if(nums[start]==nums[end]){
                    return new int[]{start,end};
                } else if(nums[start]!=target)  {
                    start+=1;

                }else{
                    end-=1;
                }


            }

        }
        return new int[]{-1,-1};
    }
}

