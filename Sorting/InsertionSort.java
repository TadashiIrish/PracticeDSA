package Sorting;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Input Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        insert(a,n);

        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        sc.close();
    }

    static void insert(int[] a, int n){
        int i,j,temp;
        for(i=0; i<n; i++){
            j=i;
            while(j>0 && a[j-1]>a[j]){
                temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
    }
    
}
