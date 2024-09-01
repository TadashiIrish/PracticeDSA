import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i = sc.nextInt();
        //int n = sc.nextInt();
        // int a[]= new int[n];
        // for(int i=0; i<n; i++)
        // {
        //     a[i]=sc.nextInt();
        // }
        sc.close();

        /*fnc(i,n);
        fnc1(i, n);
        fnc2(n,n);
        fnc3(n,n);
        fnc4(i,n);
        System.out.println(fnc5(n));*/
        //System.out.println(fnc6(n))
        System.out.println(fnc7(i,s));

    }

    static void printArray(int a[]){
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    static void fnc(int i, int n){//print name N times
        if(i>n) return;
        System.out.println(i +"ABC");
        fnc(i+1,n);
    }

    static void fnc1(int i, int n){//print N numbers in order
        if(i>n) return;
        System.out.print(i+",");
        fnc1(i+1,n);
    }

    static void fnc2(int i, int n){//print N numbers in reverse order
        if(i<1) return;
        System.out.print(i);
        fnc2(i-1,n);
    }

    static void fnc3(int i, int n){//print 1 to N using backtrack
        if(i<1) return;
        fnc3(i-1,n);
        System.out.println(i);
    }

    static void fnc4(int i, int sum){//print sum of first N numbers(parameterized)
        if(i<1){
        System.out.println(sum);
        return;
        }
        fnc4(i-1,sum+i);
    }

    static int fnc5(int n){//sum of N numbers(functional)
        if(n == 0){
            return 0;
        }
        return n + fnc5(n-1);
    }

    static int fnc6(int n){//sum of N numbers(functional)
        if(n == 0){
            return 1;
        }
        return n * fnc6(n-1);
    }

    static boolean fnc7(int i, String s){
        
        if(i>=s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;

        return fnc7(i+1,s);
    }

} 