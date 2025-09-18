import temp.Parent;

class Child extends Parent {
    String pgold = "Child Gold";
    void message() {
        System.out.println("This is Child class method");
    }
}
 
public class Demo {
    public static void main(String[] args) {
        Child c = new Child();
        c.message();
        System.out.println(c.cgold);

        System.out.println("********************");
        c.message();
        System.out.println(c.pgold);

        System.out.println("********************");

    }
}