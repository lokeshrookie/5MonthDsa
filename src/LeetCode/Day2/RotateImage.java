package LeetCode.Day2;

import java.util.Arrays;

public class RotateImage {
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
        reverse(arr);
        System.out.println("After reverse:");
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }

    }
    static  void reverse(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
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
