package chapter2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Problem: Place odd elements between even elements(as a wave).
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//
        MaxMinArr(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void MaxMinArr(int arr[], int size) {
        int[] aux = new int[size];
        for (int i = 0; i < size; i++) {
            aux[i] = arr[i];
        }
        int start = 0;
        int stop = size - 1;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                arr[i] = aux[stop];
                stop -= 1;
            } else {
                arr[i] = aux[start];
                start += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
