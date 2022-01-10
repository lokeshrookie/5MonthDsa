package chapter1.AlgorithmAnalysis;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sumarray(arr));
    }
    static int sumarray(int[] arr){
        int sum = 0;
        for(int i = 0 ; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
