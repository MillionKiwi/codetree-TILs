import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 세 사람의 위치 입력
        int[] positions = new int[3];
        for(int i = 0; i < 3; i++) {
            positions[i] = scanner.nextInt();
        }
        scanner.close();
        
        // 위치 정렬
        Arrays.sort(positions);
        int A = positions[0];
        int B = positions[1];
        int C = positions[2];
        
        int distanceAB = B - A;
        int distanceBC = C - B;
        int totalDistance = C - A;
        
        int minMoves;
        
        if(totalDistance == 2 && distanceAB == 1 && distanceBC ==1) {
            // 이미 연속된 경우
            minMoves = 0;
        }
        else if(distanceAB <=2 || distanceBC <=2) {
            // 한 번의 이동으로 가능
            minMoves = 1;
        }
        else {
            // 두 번의 이동이 필요
            minMoves = 2;
        }
        
        System.out.println(minMoves);
    }
}