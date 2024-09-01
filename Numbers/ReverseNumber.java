package Numbers;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){
            int d=n%10;
            reverse=(reverse*10)+d;
            n/=10;
        }
        System.out.print(reverse);
        sc.close();
    }
}
