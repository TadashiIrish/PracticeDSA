package Numbers;
import java.util.*;
public class EuclideanGCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        while(a>0 && b>0){
            if(a>b) a%=b;
            else b%=a;
        }
        if (a==0)
        System.out.println(b);
        else
        System.out.println(a);

        sc.close();
    }
}
