import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 세 사람의 위치 입력 받기
        int[] positions = new int[3];
        for (int i = 0; i < 3; i++) {
            positions[i] = scanner.nextInt();
        }

        // 위치 정렬
        Arrays.sort(positions);
        int a = positions[0];
        int b = positions[1];
        int c = positions[2];

        // 최소 이동 횟수 계산
        int minMoves = 0;
        if (b - a > 1) minMoves++;
        if (c - b > 1) minMoves++;
        
        minMoves = Math.max(minMoves, Math.max(b - a - 1, c - b - 1));

        System.out.println(minMoves);
        scanner.close();
    }
}