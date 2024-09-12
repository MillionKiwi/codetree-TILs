import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abilities = new int[6];
        
        // 6명의 능력치 입력
        for (int i = 0; i < 6; i++) {
            abilities[i] = sc.nextInt();
        }
        
        int totalSum = Arrays.stream(abilities).sum();
        int minDifference = Integer.MAX_VALUE;
        
        // 6명 중 3명을 선택하는 조합 구하기
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = j + 1; k < 6; k++) {
                    // 팀1의 능력 합 계산
                    int team1Sum = abilities[i] + abilities[j] + abilities[k];
                    // 팀2의 능력 합은 전체 합에서 팀1 합을 뺀 값
                    int team2Sum = totalSum - team1Sum;
                    // 두 팀 간의 차이를 절대값으로 계산
                    int difference = Math.abs(team1Sum - team2Sum);
                    // 최소 차이를 기록
                    minDifference = Math.min(minDifference, difference);
                }
            }
        }
        
        // 최소 차이 출력
        System.out.println(minDifference);
    }
}