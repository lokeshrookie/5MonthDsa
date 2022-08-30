package Tutorial;

public class IntegerClass {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(Integer.hashCode(a));
        System.out.println(Integer.bitCount(5));
        System.out.println(Integer.compare(a,b));
        System.out.println(Integer.parseInt("112"));
        System.out.println(Integer.toBinaryString(a));
    }
}
