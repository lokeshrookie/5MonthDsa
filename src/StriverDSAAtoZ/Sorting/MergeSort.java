package StriverDSAAtoZ.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,7,8,9};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }
    static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];

        int m = 0;
        int l = 0;
        int r = 0;
        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                mix[m] = left[l];
                l++;
            }
            else{
                mix[m] = right[r];
                r++;
            }
            m++;
        }
        while (l  < left.length){
            mix[m] = left[l];
            l++;
            m++;
        }
        while (r < right.length){
            mix[m] = right[r];
            r++;
            m++;
        }
        return mix;
    }


    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return  merge(left, right);
    }

}
