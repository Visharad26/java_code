public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int a[] = {10,15,20,40};
        int b[] = {5,6,6,10,15};

        int m = a.length;
        int n = b.length;

        merge(a,b,m,n);
    }
    private static void merge(int a[], int b[], int m, int n){
        int i=0;
        int j=0;
        
        while(i<m && j <n){
            if(a[i]<b[j])
            System.out.print(a[i++]+" ");
            else
            System.out.print(b[j++]+" ");
        }
        while(i<m)
        System.out.print(a[i++]+" ");
        while(j<n)
        System.out.print(b[j++]+" ");
    }
}
