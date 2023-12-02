package StriverDSAAtoZ.Arrays;
import java.util.Arrays;
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int[] arr){
        int end = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }
}
