package Arrays;
import java.util.*;
public class QuickSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//input length
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println();

        quickSort(a, 0, a.length-1);

        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();

        sc.close();
    }

    static int partition(int a[], int lb, int ub){
        int pivot=a[lb];
        int start=lb;
        int end=ub;

        while(start<end){
            while(start<ub && a[start]<=pivot){
                start++;
            }
            while (a[end]>pivot) {
                end--;
            }
            if(start<end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        int temp=a[lb];
        a[lb]=a[end];
        a[end]=temp;
        return end;
    }

    static void quickSort(int a[], int lb, int ub){
        if(lb<ub){
            int loc=partition(a, lb, ub);
            quickSort(a, lb, loc-1);
            quickSort(a, loc+1, ub);
        }
    }
}
