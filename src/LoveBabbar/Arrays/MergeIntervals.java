package LoveBabbar.Arrays;

import java.util.*;
import java.util.Comparator;

/**
 *  Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].


 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,6}, {8,10}, {15,18}};
        arr = merge(arr);
        for(int[] i : arr){
            System.out.print(Arrays.toString(i));
        }

    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;
        // 1. sort the intervals .
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // sort 2d array based on first element of inner array. i.e., a[0].
        // Arrays.sort(intervals , (a,b) -> Integer.compare(a[0], b[0])); // to sort 2d array in increasing order.
        // Arrays.sort(intervals , (a,b) -> Integer.compare(b[0], a[0])); // to sort 2d array in decreasing order.


        // 2. take a data structure to store the merged intervals or final intervals.
        List<int[]>  output_arr = new ArrayList();

        // 3.  take first interval as current interval and add to output.
        int[] current_interval = intervals[0];
        output_arr.add(current_interval);// first we add the array, and then change end of the array value in for loop
        for(int[] interval : intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if(current_end >= next_begin){
                // update the end of current interval. with the max element.
                current_interval[1] = Math.max(current_end, next_end);
            }
            else{
                // if no merge, then add the current interval into  output.
                current_interval = interval;
                output_arr.add(current_interval);
            }

        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }




}
