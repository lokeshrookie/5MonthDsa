package LoveBabbar.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(timesToRotate(arr,3)));

    }

    static int[] timesToRotate(int[] arr, int k){
        for(int i = 0; i<k; i++){
            rotate(arr);
        }
        return  arr;
    }
    static void rotate(int[] arr){
        int temp = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        /*
                Above functionality can be done by java arraycopy method:
                System.arraycopy(arr, 1, arr, 0, arr.length - 1);

         */
        arr[arr.length-1] = temp;
//        return arr;
    }

}
