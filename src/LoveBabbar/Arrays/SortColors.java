package LoveBabbar.Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr ={2,1,1,1,2,0,0,0,0,2,1,1,2,1,2,1,2,0,};
        System.out.println(Arrays.toString(colors(arr)));
    }

    /** BruteForce */
    static int[] sortColors(int[] arr){
        /*
        BruteForce Algorithm : Counting Sort
         */
        int zero = 0, one = 0, two = 0;
        for (int j : arr) {
            if (j == 0) {
                zero += 1;
            } else if (j == 1) {
                one += 1;
            } else {
                two += 1;
            }
        }
        int index = 0;
        while(zero > 0 || one >0 || two >0){
            if(zero > 0) {
                arr[index++] = 0;
                zero--;
            }
            else if(one > 0) {
                arr[index++] = 1;
                one--;
            }
            else {
                arr[index++] = 2;
                two--;
            }
        }
        return arr;
    }

    /** OPTIMISED : DUTCH NATIONAL FLAG ALGORITHM */
    /*
    1. while iterating, if you find that the element is 0, swap that element with element at start, increment start and index.
    2. if element is 2, swap with last, decrement last, increment index.
    3. if element is 1, just increase index. don't need to do anything.

        In this way, we're just swapping all the 0's with 2's and vice-versa. All the 1's will remain in the middle.
     */
    static int[] colors(int[] arr){
        if(arr.length <=1 ) return arr;
        int index = 0;
        int start = 0;
        int end = arr.length - 1;
        while(start < end && index <= end){
            if(arr[index] == 0){
                arr[index] = arr[start];
                arr[start] = 0; // same as element at index.
                start++;
                index++;
            }
            else if(arr[index] == 2){
                arr[index] = arr[end];
                arr[end] = 2; // same as element at index.
                index++;
                end--;
            }
            else{
                index++;
            }
        }
        return  arr;
    }
}
