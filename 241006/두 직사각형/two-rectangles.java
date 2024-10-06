import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        boolean isOverlapping = !(x2 < a1 || a2 < x1 || y2 < b1 || b2 < y1);

        System.out.println(isOverlapping ? "overlapping" : "nonoverlapping");
    }
}