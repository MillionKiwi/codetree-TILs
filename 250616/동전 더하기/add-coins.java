import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(coins);

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int coin = coins[i];
            if (k >= coin) {
                count += k / coin;
                k %= coin;
            }
        }

        System.out.println(count);
    }
}