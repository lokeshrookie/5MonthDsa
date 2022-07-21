package LoveBabbar.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *  Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * Example 3:
 *
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] o = {1,2,3,4,5};
        int[] t = {6,7,3,3,4,8};
        System.out.println(Arrays.toString(merge(o, t)));
//        System.out.println(Arrays.toString(method(o,t));
        method(o,t);
    }

    static int[] merge(int[] one, int[] two){
        int[] temp = new int[one.length];
         temp =  Arrays.copyOfRange(one, 0, one.length);
         int m = 0;
         int n = 0;
         int index = 0; // index for one array.
         while(m < temp.length && n < two.length){
             if(temp[m] < two[n]){
                 one[index++] = temp[m++];
             }
             else{
                 one[index++] = two[n++];
             }
         }
         while(m < temp.length){
             one[index++] = temp[m++];
         }
         while (n < two.length){
             one[index++] = two[n++];
         }
         return one;
    }
    static  void method(int[] nums1, int[] nums2){
        int m  = nums1.length;
        int n = nums2.length;
        int m1 = 0;
        int n1 = 0;
        int i = 0;
        int[] temp;
        temp = Arrays.copyOfRange(nums1, 0, m);
        while(m1 < m & n1 < n){
            if(temp[m1] < nums2[n1]){
                nums1[i] = temp[m1];
                i++;
                m1++;
            }
            else{
                nums1[i] = nums2[n1];
                i++;
                n1++;
            }
        }
        while(m1 < m){
            nums1[i++] = temp[m1++];
        }
        while(n1 < n){
            nums1[i++] = nums2[n1++];
        }
        System.out.println(Arrays.toString(nums1));
    }
}





































