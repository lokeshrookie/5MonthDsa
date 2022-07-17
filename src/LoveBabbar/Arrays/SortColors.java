package LoveBabbar.Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr ={2,1,1,1,2,0,0,0,0,2,1,1,2,1,2,1,2,0,};
        System.out.println(Arrays.toString(sortColors(arr)));
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
}
