package chapter1.AlgorithmAnalysis;

import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {5,3,2,1,5,-3,0,6,-7};
        int target = s.nextInt();
        System.out.println("Element found ar index : " + seqSearch(arr, target));
    }
    static int seqSearch(int[] arr, int target){
        for(int i= 0; i<arr.length; i++){
            if(arr[i] == target ){
                return i;
            }
        }
        return -1;
    }
}
