public class MergeTwoSortedArr2 {
    public static void main(String[] args) {
        int[] a={11,33,42,71};
        int[] b={26,54,69,81};
        int[] c=new int[a.length+b.length];
        int i=a.length-1,j=b.length-1,k=a.length+b.length-1;
        //merging
        while(i>=0&&j>=0){
            if(a[i]<=b[j]){
            c[k]=b[j];
            j--;
        }else{
            c[k]=a[i];
            i--;
            }
            k--;
        }
        if(i<0){//now take elements from b only
            while(j>=0){
                c[k]=b[j];
                j--;k--;
            }
        }
        if(j<0){//now take elements from a only
            while(i>=0){
                c[k]=a[i];
                k--;i--;
            }
        }
        for (int ele : c) {
            System.out.print(ele+" ");
        }
    }
}
