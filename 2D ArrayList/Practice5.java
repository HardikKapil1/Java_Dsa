public class Practice5 {
    public static void main(String[] args) {
        int maxSum=Integer.MIN_VALUE;
        int maxRowIndex=1;
        int[][] arr={{1 ,3, 5, 7},{3 ,4 ,7 ,8},{1 ,4, 12 ,3}};
        for (int i = 0; i < arr.length; i++) {
            int currentRowSum=0;
            for (int j = 0; j < arr[0].length; j++) {
                currentRowSum+=arr[i][j];
            }
            if(currentRowSum>maxSum){
                maxSum=currentRowSum;
                maxRowIndex+=i;
            }   
        }
        System.out.print(maxRowIndex);
    }
}
