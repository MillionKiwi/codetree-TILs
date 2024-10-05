import java.util.*;

public class Main {
    static int N;
    static int[] sums;
    static int[] sequence;
    static boolean[] used;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        sums = new int[N - 1];
        sequence = new int[N];
        used = new boolean[N + 1];
        
        for (int i = 0; i < N - 1; i++) {
            sums[i] = sc.nextInt();
        }
        
        if (backtrack(0)) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
        }
        
        sc.close();
    }
    
    static boolean backtrack(int index) {
        if (index == N) {
            return true;
        }
        
        for (int i = 1; i <= N; i++) {
            if (!used[i]) {
                if (index == 0 || i + sequence[index - 1] == sums[index - 1]) {
                    used[i] = true;
                    sequence[index] = i;
                    
                    if (backtrack(index + 1)) {
                        return true;
                    }
                    
                    used[i] = false;
                }
            }
        }
        
        return false;
    }
}