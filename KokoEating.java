package com.zaid;

import java.util.Arrays;

public class KokoEating {

    public static void main(String[] args) {
            int[]piles={332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
            int h=823855818;
//        int[] piles = {30, 11, 23, 4, 20};
//        int h = 6;
//            int[] piles={312884470};
//            int h=312884469;
        double start, end;
        double mid=0.1, ans = -1.0;

        start = 1;
        end = Arrays.stream(piles).max().getAsInt();


        while (start <= end) {
            int totalHrs;
            mid = start + (end - start) / 2;

            totalHrs = calculateTime(piles, h, mid);
            if (totalHrs <= h) {
//                    return mid;
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
//            return end;
        System.out.println((int)(ans));

    }

    static int calculateTime(int[] piles, int h, double k) {

        int totalHrs = 0;
        for (int i = 0; i < piles.length; i++) {

            if(piles[i]>=k){
                totalHrs += Math.ceil((piles[i]/k));
            }else{
                totalHrs+=1;
            }


        }
        return totalHrs;


    }


}
