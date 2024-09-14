import java.util.*;

public class Main {
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abilities = new int[6];
        for (int i = 0; i < 6; i++) {
            abilities[i] = sc.nextInt();
        }
        sc.close();

        boolean[] used = new boolean[6];
        dfs(abilities, used, new int[3], 0, 0);

        System.out.println(minDifference);
    }

    static void dfs(int[] abilities, boolean[] used, int[] teamSum, int depth, int start) {
        if (depth == 3) {
            int maxSum = Math.max(teamSum[0], Math.max(teamSum[1], teamSum[2]));
            int minSum = Math.min(teamSum[0], Math.min(teamSum[1], teamSum[2]));
            minDifference = Math.min(minDifference, maxSum - minSum);
            return;
        }

        for (int i = start; i < 5; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (!used[i] && !used[j]) {
                    used[i] = used[j] = true;
                    teamSum[depth] = abilities[i] + abilities[j];
                    dfs(abilities, used, teamSum, depth + 1, i + 1);
                    used[i] = used[j] = false;
                }
            }
        }
    }
}