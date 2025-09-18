public class marksOutput {
    public static void main(String[] args) {
        int[] marks = {81,17,45,36,31,100,60};
        for(int i=0; i<marks.length;i++){
            if(marks[i]<35){
                System.out.println(i);
            }
        }
    }
}