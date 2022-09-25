package com.chinmay.arrays.slidingwindow;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/sliding-window-maximum/
//https://leetcode.com/problems/maximum-subarray/
// https://leetcode.com/problems/subarray-sum-equals-k/
public class Problem1 {
    public int[] maxSlidingWindowBruteForce(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            int sub_max = Integer.MIN_VALUE;
            // to avoid to move when last sliding window completed
            if(((i+(k-1)) > nums.length-1)){
                return getResultInFormOfArray(result);
            }
            for(int j=i; ((j < i+k) && j < nums.length) ; j++){
                if(sub_max < nums[j]){
                    sub_max = nums[j];
                }
            }
            result.add(sub_max);
        }
        return getResultInFormOfArray(result);
    }

    private int[] getResultInFormOfArray(List<Integer> result){
        int [] resultArray = new int[result.size()];
        for(int i=0 ; i< result.size(); i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

}
