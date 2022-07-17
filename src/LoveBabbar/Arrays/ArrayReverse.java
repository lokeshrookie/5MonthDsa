package LoveBabbar.Arrays;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {-1,-2,-4,-5,4,5,6,7,8,8,9};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        while(start != end){
            swap(arr, start , end);
            start++;
            end--;
        }
        return  arr;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
