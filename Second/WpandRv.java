
class Calcuato{
    int res;
    int add(int x,int y){
        
        res=x+y;
        return res;
    }}
class Meods{
private static int sum;

public static void main(String[] args) {
Calcuato c=new Calcuato();
int a=290;
int b=40;
sum = c.add(a,b);
System.out.println(sum);
}
}