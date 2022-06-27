package LeetCode.Day1;

import java.util.*;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] arr) {
        HashSet<Integer> r = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == 0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(r.contains(i) || c.contains(j)){
                    arr[i][j] = 0;
                }
            }
        }
    }
        //test
        public static void main(String[] args) {
            int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
            setZeroes(arr);
            for(int[] row : arr){
                System.out.println(Arrays.toString(row));
            }

        }

}
