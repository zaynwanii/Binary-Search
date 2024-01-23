// Used when we don't know if the array is sorted in asc/desc order.
package com.zaid;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={14,12,10,8,6,2};

        int target=8;


        int index=orderAgnosticBS(arr,target);
        System.out.println(index);
    }
    static int orderAgnosticBS(int[] arr,int target){
        int  start=0;
        int  end=arr.length-1;
        int  mid;
        boolean isAsc=arr[start]<arr[end];
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
}
