import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search for:");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("yes");
                return;
            }}
System.out.println("no");
            
 
        }
            
    }

