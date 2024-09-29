import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3x3 보드를 입력받기
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            String line = sc.next();
            for (int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }

        // 가능한 승리 경우(가로, 세로, 대각선)의 목록
        List<int[]> lines = new ArrayList<>();
        
        // 가로
        for (int i = 0; i < 3; i++) {
            lines.add(new int[] { board[i][0], board[i][1], board[i][2] });
        }
        
        // 세로
        for (int j = 0; j < 3; j++) {
            lines.add(new int[] { board[0][j], board[1][j], board[2][j] });
        }
        
        // 대각선
        lines.add(new int[] { board[0][0], board[1][1], board[2][2] });
        lines.add(new int[] { board[0][2], board[1][1], board[2][0] });

        int teamWins = 0;

        for (int[] line : lines) {
            Set<Integer> uniqueNumbers = new HashSet<>();
            for (int num : line) {
                uniqueNumbers.add(num);
            }

            if (uniqueNumbers.size() == 2) {
                teamWins++;
            }
        }

       System.out.println(teamWins);
    }
}