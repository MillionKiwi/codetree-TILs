import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 좌석 수 입력 받기
        int N = Integer.parseInt(br.readLine());
        
        // 좌석 배치 상태 입력 받기
        String seats = br.readLine();
        
        // 사람이 앉아있는 위치를 저장할 리스트
        List<Integer> occupied = new ArrayList<>();
        
        // 현재 앉아있는 사람들의 위치 저장
        for (int i = 0; i < N; i++) {
            if (seats.charAt(i) == '1') {
                occupied.add(i);
            }
        }
        
        int result = findMaxMinDistance(N, occupied);
        System.out.println(result);
    }
    
    // 최대 최소 거리를 찾는 함수
    private static int findMaxMinDistance(int N, List<Integer> occupied) {
        int maxMinDistance = 0;
        
        // 각 빈 자리에 대해 시도
        for (int i = 0; i < N; i++) {
            // 이미 사람이 앉아있는 자리는 건너뛰기
            if (isOccupied(i, occupied)) continue;
            
            // 임시로 새로운 사람을 앉혀보기
            List<Integer> newOccupied = new ArrayList<>(occupied);
            newOccupied.add(i);
            newOccupied.sort(null);  // 위치 순으로 정렬
            
            // 이 자리에 앉혔을 때의 최소 거리 계산
            int minDistance = calculateMinDistance(newOccupied);
            
            // 최소 거리의 최댓값 갱신
            maxMinDistance = Math.max(maxMinDistance, minDistance);
        }
        
        return maxMinDistance;
    }
    
    // 주어진 위치가 이미 점유되어 있는지 확인하는 함수
    private static boolean isOccupied(int position, List<Integer> occupied) {
        return occupied.contains(position);
    }
    
    // 현재 배치에서의 최소 거리를 계산하는 함수
    private static int calculateMinDistance(List<Integer> occupied) {
        int minDistance = Integer.MAX_VALUE;
        
        // 인접한 사람들 간의 거리를 계산하여 최소값 찾기
        for (int i = 0; i < occupied.size() - 1; i++) {
            int distance = occupied.get(i + 1) - occupied.get(i);
            minDistance = Math.min(minDistance, distance);
        }
        
        return minDistance;
    }
}