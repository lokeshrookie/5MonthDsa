package chapter1.AlgorithmAnalysis;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {-22,-4,-2,0,1,2,3,4,5};
        int target = s.nextInt();
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
