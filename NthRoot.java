package com.zaid;

public class NthRoot {
    public static void main(String[] args) {
   int ans= findNthRoot(4,16);
        System.out.println(ans);
    }
    static int findNthRoot(int n,int num){
        int start=1,end=num;
        int mid;

        while(start<=end){
            mid=start+(end-start)/2;
            if (Math.pow(mid,n)==num){
                return mid;
            } else if (Math.pow(mid,n)>num) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;

    }
}


