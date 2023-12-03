package chapter1.AlgorithmAnalysis;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayWave {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 3, 4, 5, 6, 4, 2};
        CreateWave(arr);
        System.out.println(Arrays.toString(arr));
    }

    // [8, 1, 3, 2, 5, 4, 6, 2, 4]
    public static void CreateWave(int[] arr) {
        for(int i = 1; i<arr.length; i++){
            if((i-1) > 0 && arr[i] > arr[i-1]){
                swap(arr, i, i-1);
            }
            if((i+1) < arr.length && arr[i] > arr[i+1]){
                swap(arr, i , i+1);
            }
        }






    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
    }

}
