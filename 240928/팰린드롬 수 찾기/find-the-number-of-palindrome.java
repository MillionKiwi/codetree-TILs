import java.util.*;

public class Main {
    // 주어진 숫자가 팰린드롬인지 확인하는 함수
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num); // 숫자를 문자열로 변환
        String reversedStr = new StringBuilder(str).reverse().toString(); // 문자열을 뒤집음
        return str.equals(reversedStr); // 원래 문자열과 뒤집은 문자열이 같은지 비교
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int palindromeCount = 0;

        // X부터 Y까지 모든 수에 대해 팰린드롬 여부를 확인
        for (int i = X; i <= Y; i++) {
            if (isPalindrome(i)) {
                palindromeCount++;
            }
        }

        // 결과 출력
        System.out.println(palindromeCount);
    }
}