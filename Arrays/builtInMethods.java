import java.util.Arrays;

public class builtInMethods{
    public static void main(String[] args) {
        int[] arr = {5,66,554,5,54,45};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }}
}