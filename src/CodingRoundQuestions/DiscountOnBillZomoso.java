package CodingRoundQuestions;

import java.util.Scanner;

//1234567- 16
public class DiscountOnBillZomoso {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int bill = s.nextInt();
        int d = 0;
        while(bill > 0){
            int rem = bill%10;
            bill  = bill/10;
            if(rem%2 !=  0){
                d = d + rem;
            }
        }
        System.out.println(d);
    }
}