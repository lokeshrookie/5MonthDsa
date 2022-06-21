package chapter1.AlgorithmAnalysis;

import java.util.*;

public class IndexArray {
    public static void main(String[] args) {
        int[] arr = {8, -1, 6, 1, 9, 3, 2, 7, 4, -1};
        indexArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void indexArray(int[] arr){
         List<Integer> ar = new ArrayList<>();
        for (int j : arr) {
            ar.add(j);
        } // converted array to list
        for (int i = 0; i < ar.size(); i++) {
            if(ar.contains(i)){
                arr[i] = i;
            }
            else{
                arr[i] = -1;
            }
        }
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
