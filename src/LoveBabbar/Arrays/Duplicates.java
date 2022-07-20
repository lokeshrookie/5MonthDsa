package LoveBabbar.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  returning ArrayList as an array can be done by  making return type as Object[]
 */
public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,6,7,7,8,9,10};
        System.out.println(Arrays.toString(duplicates(arr)));
    }
    static Object[] duplicates(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                ans.add(arr[i]);
            }
        }
        return ans.toArray();
    }
}
