import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요. 
        int num_of_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int day = 0;

        for (int i = 0; i < m2-m1; i++){
            day = day + num_of_days[m1 + i - 1];
        }
        day = day + d2 - d1 + 1;
        System.out.println(day);
    }
}