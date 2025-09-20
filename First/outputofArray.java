import java.util.Scanner;

public class outputofArray {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        // Initializing the array with values
        // The array is of size 9 and elements are assigned values  
        System.out.println("Enter the elements of the array: ");
        // Using the Scanner class to read input from the user
        for (int i = 0; i < 8; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        // Using a for loop to print the elements of the array
        // The loop iterates from 0 to the length of the array
        // and prints each element followed by a tab space
        for (int j = 0; j < 8; j++) {
            System.out.print(arr[j]+"        ");
            sc.close();
        }
    }
}