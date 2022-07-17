package LoveBabbar.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KthLargestSmallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {5,4,3,2,1,6};
        int k = s.nextInt();
        System.out.println(largest(arr, k));
        System.out.println(smallest(arr, k));
    }

    /** BRUTE FORCE */
    //method for kth largest
    static int largest(int[] arr, int k ){
        /*
        1. Sort Array and return length - k;
         */
        Arrays.sort(arr);
        return arr[arr.length -k];
    }

    //method for kth smallest
    static int smallest(int[] arr, int k){
        /*
         Sort array and return element at k-1( because index starts with 0.
         so  0 is the first index. and 1 is the second index.).
        */
        Arrays.sort(arr);
        return arr[k-1];
    }

    /** OPTIMISED */



}
