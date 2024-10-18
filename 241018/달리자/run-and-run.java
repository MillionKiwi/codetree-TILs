import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        
        // 입력받기
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        
        int totalMovement = 0;
        int surplus = 0;
        
        for (int i = 0; i < n; i++) {
            surplus += A[i] - B[i];
            totalMovement += Math.abs(surplus);
        }
        
        System.out.println(totalMovement);
    }
}