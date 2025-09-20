import java.util.Scanner;

public class ArithematicExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter THe Number to which you want  the ap");
        int n = sc.nextInt();

    // Generate and print the first n odd numbers
            for(int i= 4 ; i<=3*n-1; i+=3){
                System.out.println(i);
         
            }
        sc.close();
    }
}
