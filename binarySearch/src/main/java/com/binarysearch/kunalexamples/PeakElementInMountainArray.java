package com.binarysearch.kunalexamples;
/*

 */
public class PeakElementInMountainArray {



    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start + (end -start)/2;
            // descending order, we are considering mid also because there is a chance it is also max element
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }else{
                // ascending order
                start = mid+1;
            }
        }
        // finally reach to start == end
        return start;
    }
}
