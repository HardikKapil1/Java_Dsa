public class SumOfElements {
    public static void main(String[] args) {
        int[][] arr = {{2,3},{5,4},{5,1}};
        int sum=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum*=arr[i][j];
            }
        }System.out.println(sum);
    }
}
