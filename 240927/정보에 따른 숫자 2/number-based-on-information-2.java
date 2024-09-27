import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int T = sc.nextInt();  // 총 알파벳 수
        int a = sc.nextInt();  // 시작 위치
        int b = sc.nextInt();  // 끝 위치

        List<Integer> sPositions = new ArrayList<>();
        List<Integer> nPositions = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            char c = sc.next().charAt(0);  // 알파벳 (S or N)
            int x = sc.nextInt();          // 위치 값
            if (c == 'S') {
                sPositions.add(x);
            } else if (c == 'N') {
                nPositions.add(x);
            }
        }

        // 특별한 위치의 수 계산
        int specialCount = 0;

        for (int x = a; x <= b; x++) {
            // x로부터 가장 가까운 S까지의 거리
            int d1 = findClosestDistance(x, sPositions);
            // x로부터 가장 가까운 N까지의 거리
            int d2 = findClosestDistance(x, nPositions);

            // 조건을 만족하면 특별한 위치로 카운트
            if (d1 <= d2) {
                specialCount++;
            }
        }

        // 결과 출력
        System.out.println(specialCount);
    }

    // 위치 x에서 가장 가까운 리스트 positions의 거리 반환
    private static int findClosestDistance(int x, List<Integer> positions) {
        int minDistance = Integer.MAX_VALUE;
        for (int pos : positions) {
            int distance = Math.abs(pos - x);
            if (distance < minDistance) {
                minDistance = distance;
            }
        }
        return minDistance;
    }
}