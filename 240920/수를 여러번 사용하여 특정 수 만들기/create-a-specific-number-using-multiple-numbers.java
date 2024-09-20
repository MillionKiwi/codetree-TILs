import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        scanner.close();
        
        // 최대값 계산
        int result = calculateMaxSum(A, B, C);
        
        // 결과 출력
        System.out.println(result);
    }
    
    public static int calculateMaxSum(int A, int B, int C) {
        int maxSum = 0;
        
        // B를 최대한 많이 사용
        int countB = C / B;
        
        while (countB >= 0) {
            int remainingSum = C - (B * countB);
            int countA = remainingSum / A;
            
            int currentSum = B * countB + A * countA;
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            countB--;
        }
        
        return maxSum;
    }
}