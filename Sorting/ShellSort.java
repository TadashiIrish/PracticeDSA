package Sorting;
import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        shellSort(arr);
        
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        int i,j,g;

        for (g = n / 2; g > 0; g /= 2) {
            
            for (j = g; j < n; j++) {

                for(i=j-g;i>=0;i-=g){
                    if(arr[i+g]>arr[i]){
                        break;
                    }
                    else{
                        int temp=arr[i+g];
                        arr[i+g]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
    }
}
