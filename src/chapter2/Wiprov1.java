package chapter2;

import java.util.Scanner;

public class Wiprov1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si = s.nextInt();
        int n = s.nextInt();
        int[] arr = new int[si];
        for(int i = 0; i<si; i++){
            arr[i] = s.nextInt();
        }
        int c = 0;
        for(int i = 0; i<si; i++){
            c = c + arr[i]/n;
        }
        System.out.println(c);
    }
}
