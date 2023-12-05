package Concepts.Strings;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        String name = "Loki";
        String name2 = "Loki";
        String name3 = new String("Loki");

        System.out.println(name.equals(name3));
        System.out.println(name==name3);


    }
}
