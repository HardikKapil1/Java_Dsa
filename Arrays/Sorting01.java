public class Sorting01 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 0, 1, 0, 0, 1, 0 };
        int n = arr.length;

        // int noofzeroes=0;
        // method 1
        // for(int i =0;i<n;i++){
        // if(arr[i]==0) noofzeroes++;
        // }
        // for(int i=0;i<n;i++) {
        // if(i<noofzeroes) arr[i]=0;
        // else arr[i]=1;
        // }
        // for (int i : arr) {
        // System.out.print(i+" ");
        // }
        // System.out.println();

        // method2->one pass solution
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0)
                i++;
            if (arr[j] == 1){
                j--;
                
            }if(i>j) break;
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }

        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
