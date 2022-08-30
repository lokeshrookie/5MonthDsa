package StriverDSAAtoZ.Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,4,4,4,5,5,6,6,6,6};
        highlowfreq(arr);
    }

    static void freq(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put( arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }

    static void highlowfreq(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int min = arr.length; int max = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            min = Math.min(min, entry.getKey());
            max = Math.max(max, entry.getKey());
        }

        System.out.println("min = " + min+ "\n max  = " + max);
    }

}
