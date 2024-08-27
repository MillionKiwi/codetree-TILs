import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int minCnt = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                cnt += Math.abs(i-j) * arr[j];
            }
            if(i == 0) minCnt = cnt;
            minCnt = Math.min(cnt,minCnt);
            cnt = 0;
        }
        System.out.println(minCnt);
    }
}