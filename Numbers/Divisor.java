package Numbers;
import java.util.*;

public class Divisor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();
    
        for (int i = 1; i <= (int)(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n/i) {
                    divisors.add(n / i);
                }
            }
        }
        
        // System.out.print("Divisors of " + n + " are: ");
        // for (int divisor : divisors) {
        //     System.out.print(divisor + " ");
        // }
        Collections.sort(divisors);
        System.out.println(divisors);

        sc.close();
    }
}
