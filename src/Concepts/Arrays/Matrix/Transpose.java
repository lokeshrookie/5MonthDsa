package Concepts.Arrays.Matrix;

import java.util.Arrays;

/**
 * Transpose of a matrix means changing the rows to columns and columns to rows.
 */
public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}, {7,8,9}};
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }

        System.out.println("After Transpose");
        transpose(arr);
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
    static void transpose(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
