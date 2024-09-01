package Strings;
import java.util.*;
public class Palindrome_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine(); //"MADAM";
        //int i=sc.nextInt();
        sc.close();
        System.out.println(fnc(s));
    }

    static boolean fnc(String s){
        int i=0;
        if(i>=s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return fnc(s);
    }
}
