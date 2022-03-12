package com.binarysearch.kunalexamples;

import java.util.Arrays;
import java.util.Scanner;

// Greatest smaller then the target element  or equal to the target element
// binary search algorithm
/*
  15, 17, 18, 45, 67, 68
  0 - 1 - 2 - 3 - 4 - 5
  target 70
      condition breaks at start = 6 and end = 5
   68 is there it is at end position so
   if element found return that index other wise
    we need to return the end
 */
public class FloorOfANumber {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = input.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the Elements into an array");
        for(int i =0; i< arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the search Element from an array");
        int target = input.nextInt();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(floorOfTheNumber(target,arr));
    }

    private static int floorOfTheNumber(int target, int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start+ (end -start)/2;
            if(arr[mid] > target){
                end = mid -1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
