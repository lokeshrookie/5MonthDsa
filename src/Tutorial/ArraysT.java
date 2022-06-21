package Tutorial;


import  java.util.*;

public class ArraysT {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int items =  scanner.nextInt();
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        for(int i = 0; i<total; i++){
            Integer[] arr = new Integer[items];
            for(int j = 0; j<items; j++){
                arr[j] = scanner.nextInt();
            }
            l.add(Arrays.asList(arr));
        }
        System.out.println(fun(l));
    }


    static int fun(List<List<Integer>> list){
        int c = 0;
        for(int i = 0; i<list.size(); i++){
            List<Integer> l = list.get(i);
            if(l.get(0) % l.get(1) == 0){
                c++;
            }
        }
        return  c;
    }

}

/*
List<Integer> ll = new ArrayList<>();
            ll.add(scanner.nextInt());
            ll.add(scanner.nextInt());
 */




