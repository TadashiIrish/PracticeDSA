package Arrays;
import java.util.*;
public class IntersectionOfSortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array 1 length:");
        int n1=sc.nextInt();
        System.out.println("Enter array 2 length:");
        int n2=sc.nextInt();

        int num1[]=new int[n1];
        System.out.println("Enter array 1:");
        for(int i=0; i<n1; i++){
            num1[i]=sc.nextInt();
        }
        int num2[]=new int[n2];
        System.out.println("Enter array 2:");
        for(int i=0; i<n2; i++){
            num2[i]=sc.nextInt();
        }

        intersection(num1, num2);
        sc.close();
    }

    static ArrayList<Integer> intersection(int num1[], int num2[]){
        int i=0;
        int j=0;

        ArrayList<Integer> ans=new ArrayList<>();

        int n1=0;
        int n2=0;
        while(i<n1 && j<n2){
            if(num1[i]<num2[j]){
                i++;
            }
            else if (num2[j]<num1[i]){
                j++;
            }
            else {
                if (!ans.contains(num1[i])) {
                    ans.add(num1[i]);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
