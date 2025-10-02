public class Practice8 {
    public static void main(String[] args) {
        int[][] matrix={{1 ,2 ,3},{4 ,5 ,6},{7 ,8 ,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                    if(i==j||i+j==2){
                    System.out.print(matrix[i][j]+" ");
                }else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}