package StriverDSAAtoZ;

import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        int sweet = arr[0];
        int j = 0;
        while(N > 0){
            sweet = arr[j+K];
            N--;
            j+=3;
            if(arr[j+1] > arr[j]){
                break;
            }
        }
        System.out.println(sweet);
    }
}
