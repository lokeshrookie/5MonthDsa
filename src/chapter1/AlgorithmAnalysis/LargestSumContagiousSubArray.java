package chapter1.AlgorithmAnalysis;

/**
 *
 *      KADANE'S ALGORIHTM
 *  we use Max sum till now and maxSum.
 *
 *  The array may contain negative elements. Due to these elements,
 *  the sum may go into zero. But we don't want that.
 *  (Because, we want to find the subArray whose sum is maximum than other subArrays).
 *
 *  If the maxSumTillNow became zero, then the sum of total subArray will be ignored
 *  and maxSumTillNow will be RESET to 0.
 *
 *  Time Complexity : O(n).
 */

public class LargestSumContagiousSubArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 0, -10, 6, 7, -2};
        int[] arr2 = {1, -2, 3, 4, -4, 6, -4, 3, 2};
        System.out.println(larestSumSubArray(arr2));
    }

    static int larestSumSubArray(int[] arr){
        int maxSumTillNow = 0;
        int maxSum = 0;
        for(int i = 0; i<arr.length; i++){
            maxSumTillNow = maxSumTillNow + arr[i];
            // if maxSumTill now can't be negative. If it is negative, we will make it zero.
            if(maxSumTillNow < 0){
                maxSumTillNow = 0;
            }
            // Update the maxSum value if the maxSumTillNow is updated.
            if(maxSum < maxSumTillNow){
                maxSum = maxSumTillNow;
            }
        }
        return maxSum;
    }
}
