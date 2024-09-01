package Arrays;
import java.util.Scanner;
public class ArrayOps {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.print("Enter size of your Array: ");
        int n=s.nextInt();
        int[] a= new int[n];

        System.out.print("Enter the number of elements you want to enter: ");
        int len=s.nextInt();
        for(int i=0; i<=len; i++){
            a[i]=s.nextInt();
        }
        
        // System.out.println("Enter the elements below: ");
        // for(int i=0; i<n; i++){
        //     a[i]=s.nextInt();
        // }

        //Print the array
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //insert element
        System.out.println("Enter element you want to insert: ");
        int ins=s.nextInt();
        System.out.println("Enter position where you want to insert: ");
        int pos=s.nextInt();
        if(len>=n){
            System.out.println("Array bhari hui hai");
        }
        else if(pos<0 || pos>n){
            System.out.println("Galat jagah daal rahe ho");
        }
        else{
            for(int i=n; i<=pos; i--){
                a[i]=a[i-1];
            }
            a[pos]=ins;
        }
        


        s.close();
    }
}
