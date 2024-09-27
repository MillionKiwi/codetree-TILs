import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;

        // 가능한 모든 쌍 (i, j)에 대해 처리
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // k가 정수인지 확인
                int sum = arr[i] + arr[j];
                if (sum % 2 != 0) {
                    continue; // k가 정수가 아니면 건너뜀
                }

                int k = sum / 2;
                
                // 등차수열 조건이 만족되는지 확인
                int count = 0;
                for (int x = 0; x < n; x++) {
                    for (int y = x + 1; y < n; y++) {
                        if (arr[y] - k == k - arr[x]) {
                            count++;
                        }
                    }
                }

                // 최댓값 갱신
                maxCount = Math.max(maxCount, count);
            }
        }

        // 결과 출력
        System.out.println(maxCount);
    }
}