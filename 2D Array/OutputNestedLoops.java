import java.util.Scanner;
public class OutputNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Elements of Array : ");
        int[][] arr = new int[2][3];
        int m=arr.length;
        System.out.println(m);
        // arr[0][0]=9;
        // Input of 2D array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // Output of 2D array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
