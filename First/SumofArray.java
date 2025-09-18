public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        // Using a for loop to calculate the sum of the array elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // Printing the sum of the array elements
        System.out.println("The sum of the array elements is: " + sum);
    }
    
}
