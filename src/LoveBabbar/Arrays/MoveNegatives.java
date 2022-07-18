package LoveBabbar.Arrays;

import java.util.Arrays;

/**
 *  Method-1: take two pointers(start, end). Whlie start <= end, if any -ve number found, swap with first index
 *  and increment the first index and regardless of this, increment start pointer for every iteration. i.e., here we check every number.
 *  if it is negative, swap will happen and index pointer will be moved further. if not index pointer will not be changed.
 *  But start pointer is moved in every iteration because, with the help of this pointer, we are checking every number.
 *
 *
 *
 *
 */
public class MoveNegatives {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,-5,-19,-10,1,2,3,4,5};
        int[] ar = {9, -4, -6 ,5 ,10 ,2 ,6,-7 ,7};
//        moveNegatives(arr);
        moveNegativesToStart(ar);
        System.out.println(Arrays.toString(ar));
    }

    /*
       9 5 10 2 6 7

       5 10 2 6 9 7


     */
    static void moveNegativesToStart(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int index = 0;
        while(start <= end ){
            if(arr[start] < 0){
                int temp  = arr[start];
                arr[start] = arr[index];
                arr[index] = temp;
                index++;
            }
            start++;
        }
    }
    static void moveNegativesToEnd(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int index = 0;
        while(start <= end ){
            if(arr[start] > 0){
                int temp  = arr[start];
                arr[start] = arr[index];
                arr[index] = temp;
                index++;
            }
            start++;
        }
    }


    // move array elements to end/right
//    static  void moveNegativesToEnd(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        int index = arr.length-1;
//        while(start <= end && index >= 0){
//            if(arr[end] <0){
//                int temp = arr[index];
//                arr[index] = arr[end];
//                arr[end] = temp;
//                index--;
//            }
//            end--;
//        }
//    }

}
