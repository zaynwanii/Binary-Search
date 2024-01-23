//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.

//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
package com.zaid;

public class SearchInRotatedArray {
    public static void main(String[] args) {
    int[] nums={4,5,6,7,0,1,2};
         int target=2;
         int pivot=findPivot(nums);
         int firstAns=binarySearch(nums,target,0,pivot);
         if (firstAns!=-1)
         {
             System.out.println(firstAns);
         }
         else{
             System.out.println(binarySearch(nums,target,pivot+1,nums.length-1));
         }



    }
    static int binarySearch(int[] nums,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int findPivot(int []nums){
            int start,mid,end,min=Integer.MAX_VALUE,index=-1;
            start=0;
            end=nums.length-1;
            while(start<=end){
                mid=start+(end-start)/2;
//                if(mid<end && nums[mid]>nums[mid+1]){
//                    return mid;
//                }
//                else if(mid>start && nums[mid-1]>nums[mid])
//                {
//                    return mid-1;
//                }
//                else if(nums[mid]<=nums[start]){
//                        end=mid-1;
//                }else if(nums[mid]>nums[start]){
//                    start=mid+1;
//                }
                if(nums[start]<nums[mid]){
//                    min=Math.min(nums[start],min);
                    if(nums[start]<min){
                        min=nums[start];
                        index=start;
                    }
                    start=mid+1;
                }else{
//                    min=Math.min(nums[mid],min);
                    if(nums[mid]<min){
                        min=nums[mid];
                        index=mid;
                    }
                    end=mid-1;
                }


            }
            return index;
    }



        }









