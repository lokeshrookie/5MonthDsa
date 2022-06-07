package chapter1.AlgorithmAnalysis;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  1. take two variables to store current max and max.
 *  2. inc current sum in every iteration.
 *  3. if current sum is less than 0, then current max set to 0.
 *  4. if current max is greater than max, then current sum will be max.
 */
public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1, -2, 3, 4, -4, 6, -4, 3, 2};
        System.out.println(Arrays.toString(arr));

        System.out.println(maxSumSubArray(arr));
    }
    static  int  maxSumSubArray(int[] arr){
        int current = 0;
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            current+=arr[i];
            if(current <0){
                current = 0;
            }

            if(current > max ){
                max = current;
            }

        }
        return  max;
    }
}
