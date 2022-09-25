package com.chinmay.arrays.slidingwindow;

public class LinkedListDebug {

    public static int reverseKGroup(int start, int k,int arr[])
    {


        int curr = start;
        int count = 0;

        // Reverse first k nodes of linked list
        while (curr <= arr.length-1 && count < k)
        {
            curr = curr+1;
            count++;
        }

        /*

        After while loop curr.next -> (K+1)th Node
        2 Cases:
        (1) k = n: Nothing left to reverse
        (2) k!=n: Reverse for Pending Node in LL

        */
        System.out.println("current"+curr+":::: count :::"+count);
        if (count == k)
        {
            // Recur starting from (k+1)th Node
            curr = reverseKGroup(curr, k,arr);

            // head -> pointer to direct part
            // curr -> pointer to reverse part

            // count = k. reversing k times
           System.out.println(curr);
            System.out.println("count"+count);
            while (count-- > 0)
            {
                System.out.println("inner:count"+count);
                System.out.println(arr[curr]);
                curr--;
            }

            start = curr; // reverse
        }

        return start;
    }

    public static void main(String args[]){

    }
}
