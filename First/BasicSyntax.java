
public class BasicSyntax {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Access elements in the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modify an element in the array
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // Loop through the array
        System.out.print("All elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
