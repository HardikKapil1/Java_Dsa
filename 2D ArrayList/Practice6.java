public class Practice6 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5},{3, 4, 5, 6, 7},{7, 6, 5, 4, 3},{8, 7, 6, 5, 4},{1, 2, 37, 8, 0}}; // Used 37 as per image
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int middleIndex = m / 2;     // Row index of the middle row (2)
        int middlecolIndex = n / 2;  // Column index of the middle column (2)

        // 1. Print TOP HALF of Middle Column (Rows 0 to middleIndex - 1)
        for (int i = 0; i < middleIndex; i++) {
            System.out.println(matrix[i][middlecolIndex]);
        }
        
        // 2. Print the ENTIRE Middle Row
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[middleIndex][j] + " ");
        }
        System.out.println(); // Newline after the middle row
        
        // 3. Print BOTTOM HALF of Middle Column (Rows middleIndex + 1 to end)
        for (int i = middleIndex + 1; i < m; i++) {
            System.out.println(matrix[i][middlecolIndex]);
        }
    }
}