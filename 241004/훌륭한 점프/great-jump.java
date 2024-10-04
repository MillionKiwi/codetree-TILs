import java.util.*;

public class Main {
    static int n, k;
    static int[] stones;
    static int minMaxValue = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        k = sc.nextInt();
        
        stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }
        
        jump(0, stones[0]);
        
        System.out.println(minMaxValue);
        
        sc.close();
    }

    static void jump(int current, int maxSoFar) {
        if (current == n - 1) {
            minMaxValue = Math.min(minMaxValue, maxSoFar);
            return;
        }

        for (int i = 1; i <= k && current + i < n; i++) {
            int nextStone = current + i;
            int newMax = Math.max(maxSoFar, stones[nextStone]);
            jump(nextStone, newMax);
        }
    }
}