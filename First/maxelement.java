public class maxelement {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 6, 7, 8, 9};
            int max = arr[0];
            int maxIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
        
            System.out.println("The maximum element in the array is: " + max + " with index: " + maxIndex);
        }
    }