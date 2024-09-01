package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        //System.out.println();

        System.out.println("Input Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        selection(a,n);

        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        sc.close();
    }

    static void selection(int[] a, int n){
        int i,j,min,temp=0;
        for (i=0; i<n-1; i++){
            min=i;
            for(j=i+1; j<n; j++){
                if(a[j]<a[min]) min=j;
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
}
