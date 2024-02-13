//https://www.geeksforgeeks.org/allocate-minimum-number-pages/
//Given that there are N books and M students. Also given are the number of pages in each book in ascending order. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum, with the condition that every student is assigned to read some consecutive books. Print that minimum number of pages.
//
//Example :
//
//Input: N = 4, pages[] = {12, 34, 67, 90}, M = 2
//
//Output: 113

package com.zaid;

import java.util.Arrays;

public class AllocateBooks {
    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int students=2;
        int sum=0,max=-1;
        for (int i = 0; i < pages.length ; i++) {
            max=Math.max(pages[i],max);
            sum+=pages[i];
        }

        int start=max,end=sum,mid;

        while(start<=end){
            mid=start+(end-start)/2;

            if(noOfStudents(pages,mid)>students){

                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println("Max pages: "+start);
    }
    static  int noOfStudents(int[]pages,int allocated){
        int studentCount=1,pagesAllocated=0;
        for (int i = 0; i < pages.length; i++) {

            if(pagesAllocated+pages[i]<=allocated){
                pagesAllocated+=pages[i];
            }else{
                studentCount++;
                pagesAllocated=pages[i];
            }

        }

        return studentCount;
    }
}
