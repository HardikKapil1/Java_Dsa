import java.util.Scanner;

public class Loopsinpout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n= sc.nextInt();
        System.out.println("Enter elements of array");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
