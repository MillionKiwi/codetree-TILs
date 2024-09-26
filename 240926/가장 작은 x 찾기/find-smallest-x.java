import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        long x = 1;
        
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            while (x * 2 < a) {
                x *= 2;
            }
            
            if (x * 2 > b) {
                x = (a + 1) / 2;
            }
        }
        
        System.out.println(x);
        scanner.close();
    }
}