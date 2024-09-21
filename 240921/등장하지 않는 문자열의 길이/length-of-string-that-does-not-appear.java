import java.util.HashSet;
import java.util.Scanner;

public class Main {
    // 중복을 체크하는 함수
    public static boolean hasDuplicateSubstring(String str, int len) {
        HashSet<String> substrings = new HashSet<>();
        for (int i = 0; i <= str.length() - len; i++) {
            String sub = str.substring(i, i + len);
            if (substrings.contains(sub)) {
                return true; // 중복되는 부분 문자열이 있음
            }
            substrings.add(sub);
        }
        return false; // 중복이 없음
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();
        String str = sc.next();
        
        // 부분 문자열의 최소 길이를 찾는 반복문
        for (int len = 1; len <= N; len++) {
            if (!hasDuplicateSubstring(str, len)) {
                System.out.println(len);
                break;
            }
        }
        sc.close();
    }
}