import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        if(x1 >= x3 && x1 <= x4) System.out.println("intersecting");
        else if(x2 >= x3 && x2 <= x4) System.out.println("intersecting");

        else System.out.println("nonintersecting");
    }
}