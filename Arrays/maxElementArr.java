public class maxElementArr {
    public static void main(String[] args) {
        int[] arr = {10,54,345,56485,43,243,3,566};      
        int mx=arr[0];
        for(int i = 0 ;i<arr.length;i++){
            // if(arr[i]>mx){
            //     mx=arr[i];
            mx=Math.max(mx, arr[i]);
        }
        int smx=Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]!=mx){
                smx=Math.max(smx,arr[i]);
            }
        }
        System.out.println(smx);
                System.out.println(mx);

    }
}