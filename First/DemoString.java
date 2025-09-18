public class DemoString {
    public static void main(String[] args) {
        String str1 = "MIET";
        String str2 = new String("MIET");

        System.out.println(str1 == str2); // false, because str1 is a string literal and str2 is an object
    }
}
