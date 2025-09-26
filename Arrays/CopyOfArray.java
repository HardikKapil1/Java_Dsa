import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {5,66,554,5,54,45};
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums=Arrays.copyOf(arr, arr.length);
        nums[0]=300;
        System.out.println(arr[0]);
        for(int eles:nums){
            System.out.print(eles+" ");
        }
    }
}
