package com.binarysearch.kunalexamples;

import java.util.Arrays;
/*
 we have duplicate elements and we need to identify the target element that is one of the solution

 */
public class FirstAndLastPosition {

    public static void main(String args[]){
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int result [] = {-1, -1};
        int firstPosition = getPositionElement(nums ,target,true);
        if(firstPosition != -1){
            int secondPosition = getPositionElement(nums,target, false);
            result[0] = firstPosition ;
            result[1] = secondPosition ;
        }
        return result ;
    }

    public static int getPositionElement(int [] nums , int target, boolean isFirstPosition){
        int start = 0;
        int end = nums.length -1;
        int ans = -1;
        while(start <= end){
            int mid = start +(end -start)/2;
            if(nums[mid] < target){
                start = mid +1;
            }else if(target < nums[mid]){
                end = mid -1;
            }else{
                ans = mid;// it is one of the solution  but we need to get closest of it
                if(isFirstPosition){
                    end = mid -1; // for starting element
                }else{
                    start = mid +1; // for ending element
                }
            }
        }
        return ans;
    }
}
