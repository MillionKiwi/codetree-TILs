import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[15];
        for (int i = 0; i < 15; i++) {
            input[i] = sc.nextInt();
        }
        
        Arrays.sort(input);
        
        for (int a = 1; a <= 10; a++) {
            for (int b = a; b <= 20; b++) {
                for (int c = b; c <= 30; c++) {
                    for (int d = c; d <= 40; d++) {
                        if (isCorrect(a, b, c, d, input)) {
                            System.out.println(a + " " + b + " " + c + " " + d);
                            return;
                        }
                    }
                }
            }
        }
    }
    
    static boolean isCorrect(int a, int b, int c, int d, int[] input) {
        int[] calculated = new int[]{
            a, b, c, d,
            a+b, b+c, c+d, d+a,
            a+c, b+d,
            a+b+c, a+b+d, a+c+d, b+c+d,
            a+b+c+d
        };
        
        Arrays.sort(calculated);
        
        for (int i = 0; i < 15; i++) {
            if (calculated[i] != input[i]) {
                return false;
            }
        }
        
        return true;
    }
}