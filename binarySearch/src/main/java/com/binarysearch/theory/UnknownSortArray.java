package com.binarysearch.theory;

import java.util.Arrays;
import java.util.Scanner;

public class UnknownSortArray {
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
        System.out.println(unKnownSortSearch(target,arr));
    }

    private static int unKnownSortSearch(int target, int[] arr) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end -start)/2;
            if (arr[mid] == target) {
                return mid;
            } else {
                if (isAsc) {
                    if (arr[mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (arr[mid] > target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
