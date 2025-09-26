public class MinValue {

    public static void main(String[] args) {
        int[] arr={34,545,76,33,7,2,35,3,0,45};
        int minvalue=minvalue(arr);
        System.out.print("Minimum value is:"+minvalue);
    }
    private static int minvalue(int[] arr){
        int minimum=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }

        }
        return minimum;
    }
}