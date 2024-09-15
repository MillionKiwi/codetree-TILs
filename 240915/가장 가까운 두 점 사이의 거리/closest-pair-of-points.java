import java.util.*;

class Dot {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Dot[] dots = new Dot[n];

        for (int i = 0; i < n; i++) {
            dots[i] = new Dot(sc.nextInt(), sc.nextInt());
        }

        int minDistSquared = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = dots[i].x - dots[j].x;
                int dy = dots[i].y - dots[j].y;
                int distSquared = dx * dx + dy * dy;
                minDistSquared = Math.min(minDistSquared, distSquared);
            }
        }

        System.out.println(minDistSquared);
    }
}