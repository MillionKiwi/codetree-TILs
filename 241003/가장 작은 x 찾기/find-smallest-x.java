import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] range = new int[n][2];

        for (int i = 0; i < n; i++) {
            range[i][0] = sc.nextInt();
            range[i][1] = sc.nextInt();
        }

        int ans = 0;

        while (true) {
            long x = ans;
            boolean pos = true;

            for (int i = 0; i < n; i++) {
                x = x * 2;

                if (x < range[i][0] || x > range[i][1]) {
                    pos = false;
                    break;
                }
            }

            if (pos) break;
            ans++;
        }

        System.out.println(ans);
        sc.close();
    }
}