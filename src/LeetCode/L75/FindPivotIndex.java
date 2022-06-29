package LeetCode.L75;

public class FindPivotIndex {
    //This is same as find the middle index. - Qno: 1991
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }

    public static  int pivotIndex(int[] nums) {
        // First find the total sum
        int total_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            total_sum += nums[i];
        }

        // find the pivot index.
        // we have to compare right sum and left sum
        // right sum = totalsum - nums[i] - leftsum
        // totalsum - nums[i] - leftsum == leftsum;
        int left_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0)
                left_sum += nums[i - 1]; // we skipped 0. so we have to add previous element. and leave the last element.
            if (total_sum - left_sum - nums[i] == left_sum) {
                return i;
            }
        }
        return -1;
    }
}
