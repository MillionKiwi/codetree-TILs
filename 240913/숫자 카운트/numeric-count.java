import java.util.*;

public class Main {
    public static int[] getCounts(String guess, String target) {
        int strike = 0, ball = 0;

        for (int i = 0; i < 3; i++) {
            if (guess.charAt(i) == target.charAt(i)) {
                strike++;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (target.contains(String.valueOf(guess.charAt(i)))) {
                ball++;
            }
        }
        ball -= strike; // 스트라이크는 볼에서 제외

        return new int[]{strike, ball};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        List<String> possibleNumbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == j) continue;
                for (int k = 1; k <= 9; k++) {
                    if (i == k || j == k) continue;
                    possibleNumbers.add("" + i + j + k);
                }
            }
        }


        int n = sc.nextInt();
        int[][] queries = new int[n][3];
        for (int i = 0; i < n; i++) {
            queries[i][0] = sc.nextInt(); // 질문한 세 자리 수
            queries[i][1] = sc.nextInt(); // 스트라이크 수
            queries[i][2] = sc.nextInt(); // 볼 수
        }


        int validNumbers = 0;
        for (String number : possibleNumbers) {
            boolean isValid = true;

            for (int i = 0; i < n; i++) {
                String queryNumber = String.valueOf(queries[i][0]);
                int expectedStrike = queries[i][1];
                int expectedBall = queries[i][2];

                int[] result = getCounts(queryNumber, number);
                int strike = result[0];
                int ball = result[1];


                if (strike != expectedStrike || ball != expectedBall) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                validNumbers++;
            }
        }
        System.out.println(validNumbers);
    }
}