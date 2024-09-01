import java.util.*;
class googleTest {
    public static void main(String args[] ) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0; i<n; i++){
        a[i]=sc.nextInt();
       }
       int p[]=new int[n];
       for(int i=0; i<n; i++){
        p[i]=sc.nextInt();
       }

       lndl(a,p,n);

       sc.close();

    }

    static void lndl(int a[], int p[], int n){
        int c=0;
        for(int i=0; i<n; i++){
            if(a[i]==p[i]){
                c++;
            }
        }
        System.out.println(c);
    }
}