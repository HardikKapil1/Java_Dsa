import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int sum=0;

        while(n!=0){
            
            int x=(n%10);
            sum+=x;
            n /=10;

        }System.out.println(sum);
    }
}
