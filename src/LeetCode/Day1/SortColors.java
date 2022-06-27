package LeetCode.Day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortColors {
    public static  void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int num : nums) {
            if (num == 0) {
                zero += 1;
            } else if (num == 1) {
                one += 1;
            } else {
                two += 1;
            }
        }

        int index = 0;
        while (zero > 0 || one > 0 || two > 0) {
            if (zero > 0) {
                nums[index++] = 0;
                zero--;
            } else if (one > 0) {
                nums[index++] = 1;
                one--;
            } else {
                nums[index++] = 2;
                two--;
            }


        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,2,1,2,1,1,1,0,0,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
