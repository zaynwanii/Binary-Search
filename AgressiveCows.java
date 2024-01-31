//Given an array of length ‘N’, where each element denotes the position of a stall. Now you have ‘N’ stalls and an integer ‘K’ which denotes the number of cows that are aggressive. To prevent the cows from hurting each other, you need to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. Return the largest minimum distance.
//Eg
//
//array: 1,2,4,8,9  &  k=3
//O/P: 3
//Explaination: 1st cow at stall 1 , 2nd cow at stall 4 and 3rd cow at stall 8

package com.zaid;

public class AgressiveCows {
    public static void main(String[] args) {
    int[] stallCoordinates={0,3,4,7,9,10};
    int cows=4;
    int minDist=-1;
    int start=0,end=stallCoordinates[stallCoordinates.length-1]-stallCoordinates[0];

    while(start<=end){
        int mid=start+(end-start)/2;

        if(canPlace(stallCoordinates,cows,mid)){
            minDist=mid;
            start=mid+1;

        }else{
           end=mid-1;
        }
    }
        System.out.println("Min distance:"+minDist);
    }
   static boolean canPlace(int[] stallCoordinates,int cows,int dist){
        int cowCount=1,lastCoordinate=stallCoordinates[0];

        for (int i = 1; i <stallCoordinates.length ; i++) {
            if(stallCoordinates[i]-lastCoordinate>=dist){
                cowCount++;
                lastCoordinate=stallCoordinates[i];
            }
            if(cowCount>=cows){
                return true;
            }
        }

        return false;
    }
}
