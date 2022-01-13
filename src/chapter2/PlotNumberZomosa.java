package chapter2;

import java.util.Scanner;

public class PlotNumberZomosa {
    public static void main(String[] args) {
        // 25643 - 3 - 45253
//        123456 - 2 = 143652
        Scanner s = new Scanner(System.in);
        int p = 123456;
        int k = 2;
        String plot = String.valueOf(p);
        StringBuffer sb = new StringBuffer(plot);
        String ans = "";
        sb = sb.append(sb.charAt(0));
        sb = sb.append(sb.charAt(1));
        for(int i = 0; i<sb.length()-k; i++){
            int c =  sb.charAt(i);
            if(c%2 == 0 ){
                sb.setCharAt(i,sb.charAt(i+k));
            }
        }
//        sb.deleteCharAt(sb.length()-1);
//        sb.deleteCharAt(sb.length()-1);
        sb.delete(sb.length()-2,sb.length());
        System.out.println(sb.toString());
    }
}
