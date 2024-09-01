package Numbers;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        int dup=n;
        while(n>0){
            int d=n%10;
            reverse=(reverse*10)+d;
            n/=10;
        }
        if(reverse==dup) System.out.println("true");
        else System.out.println("false");
        //System.out.print(reverse);
        sc.close();
    }
}