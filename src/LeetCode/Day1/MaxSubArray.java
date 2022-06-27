package LeetCode.Day1;

public class MaxSubArray {
    public static int maxSubArray(int[] arr) {
        int sum = 0;
        int maxsum = arr[0];
        for (int j : arr)
            sum = sum + j;
            if(maxsum < sum)  maxsum = sum;
            if(sum <0) sum = 0;
        return maxsum;
    }
    // test
    public static void main(String[] args) {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }
}
