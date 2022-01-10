package chapter1.AlgorithmAnalysis;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,6,5,8,99,10};
        Arrays.sort(arr);
        waveArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void waveArray(int[] arr){
        Arrays.sort(arr); // Need to sort first.
        //skipping swapped elements with i = i+2;
        for(int i = 0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
