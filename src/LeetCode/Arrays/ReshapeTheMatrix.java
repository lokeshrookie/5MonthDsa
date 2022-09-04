package LeetCode.Arrays;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(matrixReshape(arr, 3, 3)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;

        if(rows * columns != r * c){
            return mat;
        }
        int[][] outputArray = new int[r][c];
        int row = 0;
        int column = 0;
        for(int i = 0; i<=c*r; i++){
            outputArray[row][column] = mat[r][c];
            if(column == c){
                column = 0;
                row++;
            }
            column++;
        }
        return  outputArray;
    }
}
