package PracticeQuestion;
import java.util.*;
public class PalArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int res=checkArrayPalindrome(a);
        System.out.println(res);
    }
    static void modify(int a[]){
        int n=a.length;
        for(int i=0; i<=n-1; i++){
            a[i]=a[i]%2;
        }
    }
    static boolean Palindrome(int a[]){
        int start=0;
        int end=a.length-1;
        while(start<end){
            if(a[start]!=a[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    // Method to check if the array can be rearranged to form a palindrome
    public static boolean canFormPalindrome(int[] a) {
        int[] frequency = new int[2]; // Since we are only dealing with 0s and 1s, first element will storre count of 0s and other of 1s

        // Count the frequency of each element (0s and 1s)
        for (int num : a) {
            frequency[num]++;
        }

        int oddCount = 0; // To track the number of elements with odd frequency

        // Check the frequency of 0s and 1s
        for (int count : frequency) {
            if (count % 2 != 0) {
                oddCount++; // Increment odd count for odd frequencies
            }
            if (oddCount > 1) {
                return false; // More than one odd frequency means it can't be rearranged into a palindrome
            }
        }

        return true; // Can be rearranged into a palindrome
    }

    // Method to check and return 1 if palindrome or can be rearranged to palindrome, else 0
    public static int checkArrayPalindrome(int[] a) {
        // Modify the array by taking modulo 2 of each element
        modify(a);

        // Check if the modified array is a palindrome
        if (Palindrome(a)) {
            return 1;
        } else {
            // Check if the array can be rearranged to form a palindrome
            if (canFormPalindrome(a)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}