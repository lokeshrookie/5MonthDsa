package LoveBabbar;

import java.util.Scanner;

public class ArrayMinMax {
    static  int min = Integer.MAX_VALUE;
    static  int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
//        System.out.println(method(arr));
        method(arr);
        System.out.println(min + " " + max);
    }

    static  void method(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

    }
}
