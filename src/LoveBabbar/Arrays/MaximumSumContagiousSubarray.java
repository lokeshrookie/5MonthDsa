package LoveBabbar.Arrays;

public class MaximumSumContagiousSubarray {
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSum(a));
    }
    static int maxSum(int[] arr){
        int thisSum = 0;
        int MaxSum = 0;
        for (int j : arr) {
            thisSum = thisSum + j;
            if (thisSum < 0) {
                thisSum = 0;
            } else if (thisSum > MaxSum) {
                MaxSum = thisSum;
            }
        }
        return MaxSum;
    }
}
