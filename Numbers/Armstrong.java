package Numbers;
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            n/=10;
            sum=sum+(int)(Math.pow(d,3));
        }
        if(sum==org) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
        sc.close(); 
    }
}
