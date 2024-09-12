import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        int ans = 0;

        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n+1; i ++){
            for(int j = 1; j < n+1; j++){
                for(int k = 1; k < n+1; k++){
                    if((Math.abs(i - arr[0]) < 3) || (Math.abs(j-arr[1]) < 3) || (Math.abs(k-arr[2]) < 3)){
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);


    }
}