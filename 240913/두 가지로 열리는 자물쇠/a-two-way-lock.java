import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int ans = 0;

        for(int i = 0; i < 3; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 1; i < n+1; i ++){
            for(int j = 1; j < n+1; j++){
                for(int k = 1; k < n+1; k++){
                    if((Math.abs(i - arr1[0]) < 3 || Math.abs(i - arr1[0]) > n-3)){
                        if((Math.abs(j-arr1[1]) < 3 || Math.abs(j - arr1[1]) > n-3)){
                            if((Math.abs(k-arr1[2]) < 3) || (Math.abs(k - arr1[2]) > n-3)){
                                ans++;
                                continue;
                            }
                        }
                    }
                    if((Math.abs(i - arr2[0]) < 3 || Math.abs(i - arr2[0]) > n-3)){
                        if((Math.abs(j-arr2[1]) < 3 || Math.abs(j - arr2[1]) > n-3)){
                            if((Math.abs(k-arr2[2]) < 3) || (Math.abs(k - arr2[2]) > n-3)){
                                ans++;
                                continue;
                            }
                        }
                    }
                
                }
            }
        }

        System.out.println(ans);


    }
}