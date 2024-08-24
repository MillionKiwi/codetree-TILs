import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int offset = 100;
        int ans = 0;
        int [][] blocks = new int[205][205];

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;
            
            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++)    blocks[x][y] = 1;
            }
        }

        for(int i = 0; i < 205; i++){
            for(int j = 0; j < 205; j++){
                if(blocks[i][j] == 1) ans++;
            }
        }
        System.out.println(ans);
    }
}