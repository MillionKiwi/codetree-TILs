import java.util.*;

public class Main {
    static int n, k;
    static int[] stones;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        k = sc.nextInt();
        
        stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }
        
        int left = stones[0];
        int right = 100;  // 주어진 숫자의 최대값
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (canReach(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        System.out.println(left);
        
        sc.close();
    }

    static boolean canReach(int maxAllowed) {
        int current = 0;
        while (current < n - 1) {
            boolean moved = false;
            for (int jump = 1; jump <= k && current + jump < n; jump++) {
                if (stones[current + jump] <= maxAllowed) {
                    current += jump;
                    moved = true;
                    break;
                }
            }
            if (!moved) return false;
        }
        return true;
    }
}