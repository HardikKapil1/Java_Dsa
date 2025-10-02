public class Practice2 {
    public static void main(String[] args) {
        int[][] arr1={{1 ,2 ,3},{4 ,5 ,6},{7 ,8 ,9}};
        int[][] arr2={{4, 5 ,8},{0,0 ,8},{1 ,2 ,0}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr1[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
