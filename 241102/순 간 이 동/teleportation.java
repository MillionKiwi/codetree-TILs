import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // 직선으로 A에서 B까지 걷는 경우
        int directDistance = Math.abs(B - A);

        // 순간이동을 사용하는 경우 (각 경로 계산)
        int teleportFromAtoY = Math.abs(A - y) + Math.abs(B - x);
        int teleportFromAtoX = Math.abs(A - x) + Math.abs(B - y);

        // 최단 거리 선택
        int minDistance = Math.min(directDistance, Math.min(teleportFromAtoY, teleportFromAtoX));

        System.out.println(minDistance);
        scanner.close();
    }
}