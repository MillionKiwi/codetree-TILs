import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] moves = new int[N][3];

        // N번의 교환과 확인 정보 입력받기
        for (int i = 0; i < N; i++) {
            moves[i][0] = sc.nextInt();  // a번 종이컵
            moves[i][1] = sc.nextInt();  // b번 종이컵
            moves[i][2] = sc.nextInt();  // c번 종이컵 (확인할 종이컵)
        }

        int maxScore = 0;

        // 처음 조약돌을 1번, 2번, 3번 종이컵에 넣는 경우를 각각 계산
        for (int initialCup = 1; initialCup <= 3; initialCup++) {
            int score = simulateGame(initialCup, moves);
            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);
    }

    // 게임을 시뮬레이션하는 함수
    private static int simulateGame(int initialCup, int[][] moves) {
        int currentCup = initialCup;  // 조약돌이 있는 종이컵의 위치
        int score = 0;

        // 각 교환 및 확인 과정 반복
        for (int[] move : moves) {
            int a = move[0];  // 교환할 첫 번째 종이컵
            int b = move[1];  // 교환할 두 번째 종이컵
            int c = move[2];  // 확인할 종이컵

            // a와 b가 교환되었을 때, 조약돌의 위치도 교환됨
            if (currentCup == a) {
                currentCup = b;
            } else if (currentCup == b) {
                currentCup = a;
            }

            // c번 종이컵을 확인했을 때, 그 안에 조약돌이 있으면 점수 획득
            if (currentCup == c) {
                score++;
            }
        }

        return score;
    }
}