package Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        //Ascbubble(a,n);
        Descbubble(a,n);

        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }

        sc.close();
    }

    static void Descbubble(int[] a, int n){//descending order
        int i,j,temp,flag=1;
        for(i=n-1; i>=0 && i>=flag; i--){
            flag=0;
            for(j=0; j<=i-1; j++){
                if(a[j+1]>a[j]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    flag=1;
                }
            }
        }
    }

    static void Ascbubble(int[] a, int n){//ascending order
        int i,j,temp,flag=1;
        for(i=n-1; i>=0 && i>=flag; i--){
            flag=0;
            for(j=0; j<=i-1; j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
        }
    }
}
