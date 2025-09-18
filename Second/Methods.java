class Calculator{
            int a,b,res;
            void add(){
                a=10;
                b=20;
                res=a+b;
                System.out.println(res);
            }}
class Methods{
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add();
    }
}


