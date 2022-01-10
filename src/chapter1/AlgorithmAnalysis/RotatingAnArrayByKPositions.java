package chapter1.AlgorithmAnalysis;

import java.util.Arrays;
import java.util.Scanner;

public class RotatingAnArrayByKPositions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int numberOfRotatios = s.nextInt();
        /* This loop is repeated n number of times for n number of rotations */
        while(numberOfRotatios > 0){
            rotateArray(arr, numberOfRotatios);
            numberOfRotatios--;
        }
        System.out.println(Arrays.toString(arr));
    }

    /* This loop can shift only one position. This means this
        method takes first element and puts it in the last index
        and remaining elements will be shifted towards the left side. */
    static void rotateArray(int[] arr, int positions){
        int temp = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
}
