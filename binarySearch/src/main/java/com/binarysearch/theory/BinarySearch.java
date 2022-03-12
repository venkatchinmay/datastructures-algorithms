package com.binarysearch.theory;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
        System.out.println(binarySearch(target,arr));
        // helps for mountain array
        System.out.println(binarySearchAnthorWay(target,arr));
    }

    private static int binarySearch(int target, int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2 ;
            if(arr[mid] > target){
                end = mid -1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static int binarySearchAnthorWay(int target, int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2 ;
            if(arr[mid] >= target){
                end = mid;
            }else if(arr[mid] < target){
                start = mid+1;
            }
        }
        if(arr[start] == target && arr[end] == target){
            return start;
        }
        return -1;
    }
}
