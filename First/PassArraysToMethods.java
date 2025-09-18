public class PassArraysToMethods {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x);
        change(x);
        System.out.println(x); // x remains unchanged because primitives are passed by value
    }
    public static void change(int x) {
        x = 10;
    }
}
