package chapter1.AlgorithmAnalysis;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayWave {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 3, 4, 5, 6, 4, 2};
        CreateWave(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void CreateWave(int[] arr) {
        // the elements at odd index should be less than its neighbour (even index) elements.
        // i starts from first odd index. and incremented by 2(means only odd elements.).
        for (int i = 1; i < arr.length; i+=2){
            // The current index should be odd. and the current elements should be less than previous neighbour..
            if((i-1) > 0 && arr[i] > arr[i-1]){
                swap(arr, i, i-1);
            }
            // The current index should not be last index. then only we can the next neighbour.
            if((i+1) < arr.length && arr[i] > arr[i+1]){
                swap(arr, i, i+1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
    }

}
