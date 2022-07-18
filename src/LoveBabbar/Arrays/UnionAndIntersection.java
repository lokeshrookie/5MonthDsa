package LoveBabbar.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Union: combo of two sets
 * Intersection: common elements of two sets.
 *
 */
public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] one = {1,2,3,4,5};
        int[] two = {3,4,5,6,7};
//        System.out.println(union(one, two));
        System.out.println(intersection(one,two));

    }

    /** ------------------ UNION -------------------*/

    //BRUTEFORCE
//    static Set<Integer> unionb(int[] o, int[] t){
//        for(int i = 0; i)
//    }
    // OPTIMISED
    static  Set<Integer> union(int[] o, int[] t){
        HashSet<Integer> set = new HashSet<>();
        for (int k : o) {
            set.add(k);
        }
        for (int j : t) {
            set.add(j);
        }
        return set;
    }


    /** ------------------ INTERSECTION ------------ */
    // BruteForce
    static HashSet<Integer> intersection(int[] o, int[] t){
        HashSet<Integer> set = new HashSet<>();
        for (int k : o) {
            for (int i : t) {
                if (k == i) {
                    set.add(k);
                }
            }
        }
        return set;
    }


}
