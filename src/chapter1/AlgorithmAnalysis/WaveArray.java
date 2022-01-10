package chapter1.AlgorithmAnalysis;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,6,5,8,99,10};
        Arrays.sort(arr);
        wave(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void wave(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int correct = i;
            if(arr[i] != correct){
                arr[i] = -1;
            }
        }
    }
}
