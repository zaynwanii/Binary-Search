//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

package com.zaid;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='f';
        System.out.println(find(letters,target));


    }
    static char find(char[] letters,char target){
        int start,end,mid;
        start=0;
        end= letters.length-1;

//        if(target>=letters[end])
//        {
//            return letters[0];
//        }
//        else{
            while(start<=end){
                mid=start+(end-start)/2;
                if(letters[mid]<=target)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            return letters[start%letters.length];
        }

    }
//}
