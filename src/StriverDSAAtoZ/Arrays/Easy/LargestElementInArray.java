package StriverDSAAtoZ.Arrays.Easy;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,7,8,4,3,2};
        System.out.println(largestElement(arr));
    }

    private static int largestElement(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > largestElement) {
                largestElement = j;
            }
        }
        return largestElement;
    }


}
