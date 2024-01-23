//Given an array of integers nums, calculate the pivot index of this array.
//
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//Example 1:
//
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11

package com.zaid;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,0,-1,-1};
        int sumRight=0;
        int sumLeft=0 ;


//        for (int i = 0; i <= nums.length-1; i++) {
//            for (int j = i+1 ; j <= nums.length-1; j++) {
//                sumRight[i] += nums[j];
//            }
//        }
//        for (int i = nums.length-1; i >=0; i--) {
//            for (int j = i-1; j >=0 ; j--) {
//                sumLeft[i]+=nums[j];
//            }
//        }
//        for (int i = 0; i <= sumRight.length-1; i++) {
//            if(sumRight[i]==sumLeft[i])
//            {
//                System.out.println(i);
//            }
//        }

        for (int i = 0; i < nums.length; i++) {
            sumLeft+=nums[i];
        }

        for (int i = 0; i <nums.length ; i++) {
            if(sumLeft==sumRight){
                System.out.println(i);
            }
            else{
                sumLeft-=nums[i];
                sumRight+=nums[i];
            }
        }





    }
}
