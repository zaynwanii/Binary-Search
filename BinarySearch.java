//Binary Search is used for sorted arrays.
//Max no. of comparisons(Worst-case):log(n)
//1.Take middle element of Array
//2.Compare middle element of Array with target
//3.Decide whether target lies on RHS or LHS of middle element.
//4.Repeat.

package com.zaid;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14};

        int target=4;


        int index=binarySearch(arr,target);
        System.out.println(index);
    }
   static int binarySearch(int[] arr,int target){
     int  start=0;
     int  end=arr.length-1;
     int  mid;
     while(start<=end)
     {
//         mid=(start+end)/2; might exceed the range limit for int
           mid=start+(end-start)/2;//better way.
         if(arr[mid]>target)
         {
             end=mid-1;
             mid=(start+end)/2;
         }
         else if(arr[mid]<target)
         {
             start=mid+1;
         }
         else{
             return mid;
         }
     }
       return -1;
    }

}
