package StriverDSAAtoZ.Basics;

import java.util.Arrays;
import java.util.Stack;

public class Recursion {
    public static void main(String[] args) {
        for(int i = 0; i<50; i++){
            System.out.println(fibonacci(i));
        }
    }

    // print name N times
    static void printName(int number, String name){
        if(number == 0){ // base case.
            return;
        }
        System.out.println(  "Lokesh");
        printName(number-1, name);
    }

    // print up to N numbers
    static void print1toN(int number, int N){
        if( number > N){
            return;
        }
        System.out.println(number);
        print1toN(number+1, N);
    }

    // print 1 to N numbers
    static void printNto1(int number){
        if( number == 0) return;
        System.out.println(number);
        printNto1(number-1);
    }

    // Sum of first n numbers
    static int  sum(int n){
        int sum = 0;
        if(n == 0){
            return 0;
        }
        else{
            sum = sum + n;
        }
        return sum+ sum(n-1);
    }

    // Factorial of N numbers
    static int factorial(int number){
        int fact = 1;
        if( number == 1)
            return 1;
        fact = fact * number;
        return fact *  factorial(number-1);
    }

    // Reverse an array using Recursion
    static void reverseArray(int[] arr, int start, int end){
        if(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    // Return true is string is palindrome. here i is index.
    /*
    1. check first char and last char.
    2. if not equal, return false. This is base case.
    3. if equal, then call same method with string by removing first and last char.

     */
    static boolean isPalindrome(String str, int start){
        if(start > str.length()/2) {
            return true;
        }

        return str.charAt(start) == str.charAt(str.length() - start -1) && isPalindrome(str, start+1  );
    }

    // Returns nth fibonacci number.
    static int fibonacci(int number){
        if( number < 2) {
            return number;
        }
        return  fibonacci(number-1) + fibonacci(number-2);
    }
}











