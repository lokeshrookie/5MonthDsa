package StriverDSAAtoZ.Basics;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(primeNumber(6));
        for (int i = 1; i < 50; i++) {
            if(primeNumber(i)){
                System.out.println(i);
            }
        }
    }

    // print true if the given number is palindromeo
    static boolean palindrome(int number){
        int rev = reverse(number);
        return  rev == number;
    }


    //  prints all the divisors of the given number.
    static void divisor(int number){ // 10
        for (int i = 1; i <= number; i++) {
            if(number%i == 0) System.out.println(i + " ");
        }
    }

    // Returns number of Digits in the given number.
    static int countDigits(int number){
        int noOfDigits = 0;
        while(number > 0){
            noOfDigits++;
            number/=10;
        }
        return noOfDigits;
    }


    // Returns teh number in reverse format.
    static int reverse(int number){
        int reverse = 0;
        while (number > 0){
             reverse = reverse * 10 +  number%10;
             number/=10;
        }
        return reverse;
    }

    // GCD - The Greatest Common Divisor of two numbers.
    // Divisor means divides two given numbers and gives 0 as remainder.
    static int gcd(int number1, int number2){
        if(number1 == 0 || number2 == 0) return 0;
        int min = Integer.min(number1, number2);
        int gcd = 0;
        for(int i = 1; i<= min ; i++){
            if(number1%i == 0 &&  number2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    // LCM - Least Common Multiple
    //
    static int lcm(int number1, int number2){
        int lcm = Math.max(number1, number2);
        while(true){
            if(lcm%number1 == 0 && lcm%number2 == 0){
                return lcm;
            }
            else{
                lcm++;
            }
        }
    }
    static boolean armstrong(int number){
        int temp = number;
        int sum = 0;
        while(number > 0){
            // 123 == 1^3 + 2^3 + 3^3
            sum +=  Math.pow(number%10 , 3);
            number/=10;
        }
        return temp == sum;
    }

    // returns sum of all the digits.
    static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            sum += number%10;
            number/=10;
        }
        return sum;
    }

    //  Prime Number
    static boolean primeNumber(int number){
        // prime number means divisible by 1 and itself.
        if( number < 2){
            return false;
        }
        int factors = 0;
        for(int i = 1; i<=number; i++){ // start checking from 1 until that number.
            if(number%i == 0){
                factors++;
            }
            if(factors>2){
                return false;
            }
        }
        return true;
    }
}
