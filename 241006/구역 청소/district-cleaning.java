import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int totalCleaned;

        if (b < c || d < a) {
            totalCleaned = (b - a) + (d - c);
        }
        else {
            int start = Math.min(a, c);
            int end = Math.max(b, d);
            totalCleaned =  end - start;
        }

   
        System.out.println(totalCleaned);
    }
}