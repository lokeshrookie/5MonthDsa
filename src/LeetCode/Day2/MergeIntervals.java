package LeetCode.Day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2, 6},  { 8, 10}, {9, 11}, {15,18}};
        System.out.println(Arrays.toString(arr));
//        mergeIntervals(arr);
//        System.out.println(mergeIntervals(arr));
//        System.out.println(Comparator.comparing());
    }

    static  int[][]  mergeIntervals(int[][] arr){
        if(arr.length <=1) return arr;

//        sort(arr , Comparator.comparingInt(arr2 -> arr2[0]));
//        sort(arr , (arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
        sort(arr, Comparator.comparingInt(a -> a[0]));

        return arr;

    }
}
