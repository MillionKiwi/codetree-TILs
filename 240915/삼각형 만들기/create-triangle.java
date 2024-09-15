import java.util.*;

class Dot {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Dot[] dots = new Dot[n];

        for (int i = 0; i < n; i++) {
            dots[i] = new Dot(sc.nextInt(), sc.nextInt());
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && dots[i].x == dots[j].x) { 
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j && dots[i].y == dots[k].y) {  
                            int width = Math.abs(dots[i].y - dots[j].y); 
                            int height = Math.abs(dots[i].x - dots[k].x); 
                            int area = width * height; 
                            maxArea = Math.max(maxArea, area);
                        }
                    }
                }
            }
        }

        System.out.println(maxArea );
    }
}