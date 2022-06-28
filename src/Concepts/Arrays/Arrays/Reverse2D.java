package Concepts.Arrays.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse2D {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9}};
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("After Reversing");
        reverse2d(arr);
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
    static  void reverse2d(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;

            }
        }
    }
}
