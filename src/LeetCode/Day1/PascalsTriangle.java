package LeetCode.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
       pascal(size);
       // printing the output
    }

    public static  void pascal(int rows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>(); // an arraylist holding diff arraylists. (liked 2d array but dynamic.
        //Not all the rows are of equal size)
        List<Integer> row, pre = null; // initially both are null.
        for (int i = 0; i < rows; i++) {
            row = new ArrayList<Integer>(); // crete new arraylist for every row.
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {  // first and last element of every row is always 1. last(j == i)
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row; // make the creted row as previous row.
            res.add(row); // add every row created to the result.
        }

        //printing the output
        for(List<Integer> line : res){
            System.out.println(line);
        }
    }
}
