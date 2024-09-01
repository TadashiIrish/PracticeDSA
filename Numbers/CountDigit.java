package Numbers;
import java.util.*;
//import java.math.*;
public class CountDigit {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=(int)(Math.log10(n)+1);
        /*int c=0;
        while(n>0){
            int digit=n%10;
            System.out.println(digit);//reverse order
            c++;                      //no of digits
            n/=10;
        }*/
        System.out.println(c);
        sc.close();
    }
}
