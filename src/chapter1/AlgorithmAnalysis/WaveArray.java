package chapter1.AlgorithmAnalysis;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,0,4,3,6,5,8,99,10};
        int[] arr = {8, 1, 2, 3, 4, 5, 6,4,2};
        Arrays.sort(arr);
        waveArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void waveArray(int[] arr){
        //skipping swapped elements with i = i+2;
        for(int i = 0; i<arr.length-1; i+=2){
            swap(arr, arr[i], arr[i+1]);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;

    }
}
