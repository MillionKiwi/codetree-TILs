import java.util.Scanner;

public class Main {
    
    // 현재 좌석 배열에서 최소 거리를 구하는 함수
    public static int calculateMinDistance(int[] seats) {
        int lastOccupied = -1;
        int minDistance = Integer.MAX_VALUE;
        
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (lastOccupied != -1) {
                    // 현재 사람과 이전 사람 간의 거리 계산
                    minDistance = Math.min(minDistance, i - lastOccupied);
                }
                lastOccupied = i;
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 좌석의 개수 N 입력
        int N = sc.nextInt();
        
        // 좌석의 상태를 입력받음 ('0'은 빈자리, '1'은 이미 사람이 앉은 자리)
        String seatsInput = sc.next();
        int[] seats = new int[N];
        
        for (int i = 0; i < N; i++) {
            seats[i] = seatsInput.charAt(i) - '0';
        }
        
        int maxMinDistance = 0;
        
        // 빈 자리에 사람을 앉히는 모든 경우의 수를 확인
        for (int i = 0; i < N; i++) {
            if (seats[i] == 0) { // 빈 자리라면
                seats[i] = 1; // 한 명을 앉힘
                
                // 그 상태에서 가장 가까운 두 사람 간의 최소 거리를 구함
                int minDistance = calculateMinDistance(seats);
                
                // 그 중 가장 큰 최소 거리를 기록
                maxMinDistance = Math.max(maxMinDistance, minDistance);
                
                seats[i] = 0; // 다시 빈자리로 되돌림
            }
        }
        
        // 최종적으로 가장 큰 최소 거리를 출력
        System.out.println(maxMinDistance);
        
        sc.close();
    }
}