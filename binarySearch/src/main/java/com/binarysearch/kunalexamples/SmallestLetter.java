package com.binarysearch.kunalexamples;
/*
   1. does not consider equals
   2. if start exceed the length of the array -1 then return first element (0 th)
 */


import java.util.Arrays;
import java.util.Scanner;

public class SmallestLetter {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = input.nextInt();
        char letters [] = new char[length];
        System.out.println("Enter the Elements into an array");
        for(int i =0; i< letters.length; i++){
            letters[i] = input.next().charAt(0);
        }
        System.out.println("Enter the search Element from an array");
        int target = input.nextInt();
        System.out.println(Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println(smallestLetter(target,letters));
    }

    private static char smallestLetter(int target, char[] letters) {
        int start = 0;
        int end = letters.length-1;
        int mid = end +(end -start)/2;
        if (target > letters[mid]){
            start = mid +1;
        }else {
            end = mid -1;
        }
        return letters[start % letters.length];
    }
}
