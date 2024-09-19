import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] times = new int[N][2];

        // 개발자들의 근무 시간 입력 받기
        for (int i = 0; i < N; i++) {
            times[i][0] = sc.nextInt();  // 시작 시간 A
            times[i][1] = sc.nextInt();  // 끝 시간 B
        }

        int maxOperatingTime = 0;

        // 한 명을 해고했을 때의 최대 운행 시간을 구하기
        for (int i = 0; i < N; i++) {
            List<int[]> remainingTimes = new ArrayList<>();

            // i번째 개발자를 제외한 나머지 개발자의 근무 시간을 리스트에 추가
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    remainingTimes.add(times[j]);
                }
            }

            // 나머지 개발자들의 근무 시간으로 최대 운행 시간을 계산
            int currentOperatingTime = calculateOperatingTime(remainingTimes);
            maxOperatingTime = Math.max(maxOperatingTime, currentOperatingTime);
        }

        System.out.println(maxOperatingTime);
    }

    // 운행 시간을 계산하는 함수
    private static int calculateOperatingTime(List<int[]> times) {
        // 근무 시간을 시작 시간 기준으로 정렬
        times.sort(Comparator.comparingInt(a -> a[0]));

        int operatingTime = 0;
        int currentStart = times.get(0)[0];
        int currentEnd = times.get(0)[1];

        // 연속되는 시간대를 계산하여 운행 시간을 구함
        for (int i = 1; i < times.size(); i++) {
            if (times.get(i)[0] <= currentEnd) {
                currentEnd = Math.max(currentEnd, times.get(i)[1]);
            } else {
                operatingTime += currentEnd - currentStart;
                currentStart = times.get(i)[0];
                currentEnd = times.get(i)[1];
            }
        }
        operatingTime += currentEnd - currentStart;

        return operatingTime;
    }
}