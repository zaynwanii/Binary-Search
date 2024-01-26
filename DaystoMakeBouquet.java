package com.zaid;

import java.util.Arrays;

public class DaystoMakeBouquet {
    public static void main(String [] args) {

            int start,mid,end,ans=-1;
            int[] bloomDay={1,10,2,9,3,8,4,7,5,6};

            int m=4,k=2;

            start=1;
            end=Arrays.stream(bloomDay).max().getAsInt();

            while(start<=end){
                mid=start+(end-start)/2;

                int bloomedCount=bloomedFlowers(bloomDay,mid,k);

                if(bloomedCount>=m*k){
                    ans=mid;
                    end=mid-1;
                }
                if(bloomedCount<m*k){
                    start=mid+1;
                }

            }
        System.out.println("Min Days required to make bouquet: "+ans);
        }

      static  int bloomedFlowers(int[] bloomDay,int day,int k){
            int bloomedCount=0;
            for(int i=0;i<bloomDay.length;i++){
                if(k==1){
                    if(bloomDay[i]<=day ){
                        bloomedCount++;
                   }
                }else{
                    if(bloomDay[i]<=day ){
                        bloomedCount++;

                    }else{
                         bloomedCount=0;
                        continue;
                    }
                }

            }
            return bloomedCount;
        }
    }

