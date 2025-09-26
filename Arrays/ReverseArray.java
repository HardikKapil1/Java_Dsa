import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 94, 56, 76, 36, 65, 34 };
        int n = arr.length;
        for (int i : arr) {
            System.out.print(i + " ");
            Arrays.sort(arr);
        }
        System.out.println();
        // for (int i = 0; i < n/2; i++) {
        //     int j = n- 1 - i;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }
        //Two Pointer
        int i=0,j=n-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
    }
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        System.out.println();
    }
        public static void swap(int[] arr, int i,int j){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
