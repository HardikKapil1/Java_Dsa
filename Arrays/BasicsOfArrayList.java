import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        // int[] arr={1,2,3};
        // double[] arr ={3.14,3.43,234.43}

        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 100);
        arr.add(1, 200);
        arr.add(2, 1300);
        arr.add(3, 1030);
        arr.add(4, 1050);
        arr.add(5, 10055);

        // System.out.println(arr);

        System.out.println(arr);
        arr.set(2, 30);
        System.out.println(arr);
        arr.add(90);

        System.out.println(arr);
        System.out.println(arr.size());
    }
}