package chapter1.AlgorithmAnalysis;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *  Sort the array Before Copying
 */

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6};
//        System.out.println(Arrays.toString(min(arr)));
//        MaxMinArr(arr, arr.length);
        maxMinArr(arr, arr.length);
        maxMinArr1(arr, arr.length);
        maxMinArr2(arr, arr.length);

    }
    static void maxMinArr1(int[] arr, int size){
        Arrays.sort(arr);
        int[] aux = new int[size];
        for(int i = 0; i<size; i++){
            aux[i] = arr[i];
        }
        int start = 0;
        int stop = size-1;
        for(int i = 0; i<size; i++){
            if(i%2 == 0){
                arr[i] = aux[stop];
                stop-=1;
            }
            else {
                arr[i] = aux[start];
                start+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void maxMinArr(int[] arr, int size){
        Arrays.sort(arr);
        int[] ans = new int[size];
        System.arraycopy(arr, 0, ans, 0, arr.length); //--------
        int min = 0;
        int max = size -1;
        for(int i = 0 ; i<arr.length-1; i+=2){ // changinge two indexes at a time. so skipping index by 2;
            arr[i] = ans[max]; // first index will be max
            arr[i+1] = ans[min]; // second index will be min.
            /*
            Third element will be second max, fourth element will be second min.
             */
            max--;
            min++;
         }
        System.out.println("ans :" + Arrays.toString(arr));
    }

    /*
    Method 2: Array reverse

   1 2 3 4 5 6 - input
   6 5 4 3 2 1
   6 1 2 3 4 5
   6 1 5 4 3 2
   6 1 5 2 3 4
   6 1 5 2 4 3 - output

   */
    static void maxMinArr2(int[] arr, int size){
        Arrays.sort(arr);
        int start = 0;
        int stop = size-1;
        while (start < stop) {
            swap(arr, start, stop);
            start += 1;
            stop -= 1;
        }
        System.out.println(Arrays.toString(arr));

    }
    static  void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }






}