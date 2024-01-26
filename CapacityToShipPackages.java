//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
//A conveyor belt has packages that must be shipped from one port to another within days days.
//The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
//Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

//Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
//Output: 15
//Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
//1st day: 1, 2, 3, 4, 5
//2nd day: 6, 7
//3rd day: 8
//4th day: 9
//5th day: 10
//
//Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
//Example 2:

package com.zaid;

public class CapacityToShipPackages {
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days=5;

                int start=0,end=0,mid,ans=-1;
                for(int i=0;i<weights.length;i++){
                    start=Math.max(start,weights[i]);
                }
                for(int i=0;i<weights.length;i++){
                    end+=weights[i];
                }

                while(start<=end){
                    mid=start+(end-start)/2;

                    if(daysRequired(weights,mid)<=days){

                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
        System.out.println("Min capacity required: "+start);
            }
          static  int daysRequired(int[] weights,int capacity){
                int days=1,load=0;
                for(int i=0;i<weights.length;i++){
                    if(load+weights[i]>capacity){
                        days+=1;
                        load=weights[i];
                    }else{
                        load+=weights[i];
                    }
                }
                return days;
            }
        }

