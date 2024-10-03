import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        Arrays.sort(numbers);
        
        int maxCount = 0;
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = i + 1; j < N; j++) {
                if (numbers[j] - numbers[i] <= K) {
                    count++;
                } else {
                    break;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        
        System.out.println(maxCount);
        
        sc.close();
    }
}