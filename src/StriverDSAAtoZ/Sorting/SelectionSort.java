package StriverDSAAtoZ.Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Not Stable
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length-i-1;
            int max = findMax(arr, last);
            swap(arr, max, last);
        }
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findMax(int[] arr, int last){
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}













