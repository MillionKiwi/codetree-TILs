import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int power = 0;

        while(n > 0){
            ans += (n % 10) * Math.pow(2,power);
            power++;
            n = n / 10;
        }

        System.out.println(ans);
    }
}