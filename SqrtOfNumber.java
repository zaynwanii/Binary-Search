package com.zaid;

public class SqrtOfNumber {
    public static void main(String[] args) {
        int n=9;
        int start,mid,end,ans=1;
        start=1;
        end=n;

        while(start<=end){
            mid=start+(end-start)/2;


             if(mid*mid>n){
                end=mid-1;
            }else{
                start=mid+1;
            }
            if(mid*mid==n ||mid*mid<n){
                ans=mid;
                start=mid+1;

            }
        }
        System.out.println(ans);
    }
}
