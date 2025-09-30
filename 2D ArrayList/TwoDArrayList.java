import java.util.ArrayList;
import java.util.List;

public class TwoDArrayList {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(200);
        a.add(100);
        List<Integer> b=new ArrayList<>();
        b.add(323);
        b.add(3254);
        b.add(353);
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(54);
        List<List<Integer>> l=new ArrayList<>();  
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
        System.out.println(l.size());

        // for (int i = 0; i < l.size(); i++) {
        //         System.out.println(l.get(i));
        // }
        // System.out.println(l.get(1).get(1));

        for (int i = 0; i < l.size(); i++) {
            List<Integer> x =l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");

            }
            System.out.println();
        }
    }
}