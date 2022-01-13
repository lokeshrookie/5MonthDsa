package chapter1.AlgorithmAnalysis;

import java.util.Arrays;

public class IndexArray {
    public static void main(String[] args) {
        int[] arr = {8, -1, 6, 1, 9, 3, 2, 7, 4, -1};
        indexArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void indexArr(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != i){
                arr[i] = -1;
            }
        }
    }
}
