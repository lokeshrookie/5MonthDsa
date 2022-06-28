
package Concepts.Arrays.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.print("Before: ");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println();
        System.out.print("After: ");
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        for(int i = 0; i<=arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -1-i];
            arr[arr.length -1-i] = temp;
        }
    }
}
