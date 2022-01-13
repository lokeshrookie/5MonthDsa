package chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class ZomosoMinDistanceToMeet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si = s.nextInt();
        int[] a = new int[si];
        for(int i = 0; i<a.length; i++) {
            a[i] = s.nextInt();
        }



//        System.out.println("inputs :" + Arrays.toString(a));\
        System.out.println(minDist(a, si));
    }
    static int minDist(int[] a, int si){
        int com = 0;
        for(int i =0; i<a.length; i++){
            com = com + a[i];
        }
        return com;
    }
}
