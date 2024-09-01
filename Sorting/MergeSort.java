package Sorting;
import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array ");
        int n=sc.nextInt();
        
        int a[]=new int[n];//length of array assigned
        
        System.out.println("Input array elements: ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("Input Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        msort(a, 0, n-1);

        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sc.close();
    }

    static void merge(int a[], int l, int mid, int u){
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = l;  
        int right = mid + 1; 

        while (left <= mid && right <= u) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }

        while (right <= u) {
            temp.add(a[right]);
            right++;
        }

        for (int i = l; i <= u; i++) {
            a[i] = temp.get(i - l);
        }

    }

    static void msort(int a[], int l, int u){
        if (l >= u) return;
        int mid = (l + u) / 2 ;
        msort(a, l, mid);  // left half
        msort(a, mid + 1, u); // right half
        merge(a, l, mid, u); //merge the halves
    }
}
