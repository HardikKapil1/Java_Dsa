public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{-2,3},{5,4},{488,999}};
        int mx =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                mx=Math.max(mx, arr[i][j]);
            }
            // System.out.println();
        }System.out.println(mx);
    }
}
