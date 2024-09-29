import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];

        // 입력 받기
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            board[i] = line.toCharArray();
        }

        int winningTeams = countWinningTeams(board);
        System.out.println(winningTeams);
    }

    private static int countWinningTeams(char[][] board) {
        Set<String> winningTeams = new HashSet<>();

        // 가로 줄 확인
        for (int i = 0; i < 3; i++) {
            checkLine(board[i][0], board[i][1], board[i][2], winningTeams);
        }

        // 세로 줄 확인
        for (int j = 0; j < 3; j++) {
            checkLine(board[0][j], board[1][j], board[2][j], winningTeams);
        }

        // 대각선 확인
        checkLine(board[0][0], board[1][1], board[2][2], winningTeams);
        checkLine(board[0][2], board[1][1], board[2][0], winningTeams);

        return winningTeams.size();
    }

    private static void checkLine(char a, char b, char c, Set<String> winningTeams) {
        Set<Character> uniqueChars = new HashSet<>();
        uniqueChars.add(a);
        uniqueChars.add(b);
        uniqueChars.add(c);

        if (uniqueChars.size() == 2) {
            List<Character> chars = new ArrayList<>(uniqueChars);
            winningTeams.add(chars.get(0) + "" + chars.get(1));
        }
    }
}