import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int offset = 1000;
        int ans = 0;
        int [][] blocks = new int[2001][2001];

        for(int i = 0; i < 3; i++){
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;
            
            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    if(i < 2)   blocks[x][y] = 1;
                    else    blocks[x][y] = 2;
                }
            }
        }

        for(int i = 0; i < 2001; i++){
            for(int j = 0; j < 2001; j++){
                if(blocks[i][j] == 1) ans++;
            }
        }
        System.out.println(ans);
    }
}