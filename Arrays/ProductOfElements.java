public class ProductOfElements {
    public static void main(String[] args) {
        int[] arr={10,5};
        int product=1;
        for (int i : arr) {
            product*=i;
        }
       
        System.out.print("Product is "+product);
    }
}
