public class MaxInArray {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int n=arr.length;
        int mx=Integer.MIN_VALUE; // Initialize mx to the smallest possible integer value
        // Loop through the array to find the maximum value
        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i]; // Update mx if the current element is greater
            }
        }
        int smx=Integer.MIN_VALUE; // Initialize smx to the smallest possible integer value
        // Loop through the array to find the second maximum value
        for (int i = 0; i < n; i++) {
            if (arr[i] > smx && arr[i] < mx) {
                smx = arr[i]; // Update smx if the current element is greater than smx and less than mx
            }
        }
        // Print the maximum and second maximum values
        System.out.println("The maximum value in the array is: " + mx);
        System.out.println("The second maximum value in the array is: " + smx);
    }
}