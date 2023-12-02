package chapter1.AlgorithmAnalysis;

import java.util.Arrays;
import java.util.Scanner;

/** This loop can shift only one position. This means this
        method takes first element and puts it in the last index
        and remaining elements will be shifted towards the left side. */

public class RotatingAnArrayByKPositions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int numberOfRotatios = s.nextInt();
        /* This loop is repeated n number of times for n number of rotations */
        System.out.println(Arrays.toString(arr));
        while(numberOfRotatios > 0){
            rotateArray(arr, numberOfRotatios);
            numberOfRotatios--;
        }
        System.out.println(Arrays.toString(arr));
    }


    static void rotateArray(int[] arr, int positions){
       int firstElement = arr[0];
       // put element at 0th index to the last index.
        // and shift the remaining elements to left side by one step
        for(int index = 0; index<arr.length-1; index++){
            arr[index] = arr[index+1];
        }
        arr[arr.length-1] = firstElement;
    }
}
