package Sorting;
import java.util.*;

public class QuickSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        
        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Convert array to list
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(arr[i]);
        }

        System.out.println("Input Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sort the list using quick sort
        quickSort(a, 0, a.size() - 1);

        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println();

        sc.close();
    }

    static void quickSort(List<Integer> a, int l, int h){
        if(l < h){
            int p = partition(a, l, h);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
        }
    }

    static int partition(List<Integer> a, int l, int h){
        int p = a.get(l);
        int i = l;
        int j = h;
        while(i < j){
            while(i <= h && a.get(i) <= p){
                i++;
            }
            while(a.get(j) > p){
                j--;
            }
            if(i < j){
                // Swap elements at indices i and j
                int t = a.get(i);
                a.set(i, a.get(j));
                a.set(j, t);
            }
        }
        // Swap elements at indices l and j
        int t = a.get(l);
        a.set(l, a.get(j));
        a.set(j, t);
        return j;
    }
}
