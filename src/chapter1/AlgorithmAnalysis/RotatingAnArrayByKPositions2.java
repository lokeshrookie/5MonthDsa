package chapter1.AlgorithmAnalysis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. take first element and put aside.
 * 2. move all the other elements to left side.
 * 3. put that taken element on to the last.
 */
public class RotatingAnArrayByKPositions2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("No of positions to rotate: ");
        int k = input.nextInt();
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rotate(arr, k); // pass array and k (no of positions to rotate).
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr , int k ){
        for(int i = 0; i<k; i++){
            rot(arr);
        }
    }
    static  void rot(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
         /* This is an alternative for the above loop.
         System.arraycopy(arr, 1, arr, 0, arr.length - 1);
         */
        arr[arr.length-1] = first;
    }
}


