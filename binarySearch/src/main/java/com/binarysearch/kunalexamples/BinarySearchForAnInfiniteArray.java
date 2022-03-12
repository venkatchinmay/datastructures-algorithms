package com.binarysearch.kunalexamples;

public class BinarySearchForAnInfiniteArray
{
    public static void main (String args[]){
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
       System.out.println(binarySearchForInifiniteArray(arr,target));
    }

    public static int binarySearchForInifiniteArray(int [] arr, int target){
        int start = 0;
        int end = 1;
        int exp = 2;
        while(target > arr[end]){
            start = end +1 ;
            end = end + 2 ^ exp;
            exp = exp+1;
        }
        return binarySearch(start,end,arr,target);
    }

    public static int binarySearch(int start, int end , int arr[], int target){
        while(start <= end){
          int mid = start + (end -start)/2;
          if (target < arr[mid]){
              end = mid -1;
          }else if(target > arr[mid]){
              start = mid +1;
          }else{
              return mid;
          }
        }
        return -1;
    }

}
