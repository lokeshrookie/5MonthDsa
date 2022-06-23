package Concepts.Recursion;

public class Nnumbers {
    public static void main(String[] args) {
        num(1, 10);
    }


    static int  num(int n, int j){
        if(n == j  ){
            System.out.println(j);
            return j;
        }
        System.out.println(n);
        return num(n+1, j);
    }
}
