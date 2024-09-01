package Numbers;
import java.util.Scanner;
public class BeautifulNumber {
    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int t = 0; t < n; t++) {
            int x = scanner.nextInt();
            int k = scanner.nextInt();
            
            if (isbooty(x, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
    static boolean isbooty(int x, int k) {
        while (x > 0) {
            if (x % k > 1) {
                return false;
            }
            x /= k;
        }
        return true;
    }
}
