import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int a = 4,d= 4;
        // for(int i=1;i<=n;i++){
        //     System.out.println(a);
        //     a+=d;
        int a = 1;
        for(int i =1; i<=n;i++){
            System.out.println(a);
            a*=3;
            sc.close();
        }
        }
    }  

