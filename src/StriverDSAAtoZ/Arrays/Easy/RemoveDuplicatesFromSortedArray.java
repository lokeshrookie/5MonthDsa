package StriverDSAAtoZ.Arrays.Easy;

import java.util.Arrays;

/**
 * Method 1: Hashset
 * Method 2:
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,5,6,7,7,7,8,9,10};
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
    // Array must be sorted.
    static void removeDuplicates(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == arr[i+1]){


            }
        }
    }
}
