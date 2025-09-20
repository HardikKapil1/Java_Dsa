import java.util.Scanner;

public class MinimumSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr1 = {n};
            
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
                sum += arr1[i];
            }
            System.out.println("Sum: " + sum);
        }
    }
}
