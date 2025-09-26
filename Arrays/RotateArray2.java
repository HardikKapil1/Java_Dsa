public class RotateArray2 {
public void reverse(int[] nums,int i , int j){
    while(i<=j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }
}
public void rotate(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
    
    reverse(nums,0,n-k-1);
    reverse(nums,n-k,n-1);
    reverse(nums,0,n-1);
}
    public static void main(String[] args) {
        int[] nums={32,43,54,23,345,66,87};
        int k=1;
        RotateArray2 rotator= new RotateArray2();
        rotator.rotate(nums,k);
        for (int i : nums) {
            
            System.out.print(i+" ");
        }
    } 
}
