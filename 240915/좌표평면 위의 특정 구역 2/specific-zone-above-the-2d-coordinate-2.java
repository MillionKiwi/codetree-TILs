import java.util.*;
import java.io.*;

class Dot{
    int x;
    int y;

    public Dot(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Dot[] dots = new Dot[n];

        for(int i = 0; i < n; i++ ){
            dots[i] = new Dot(sc.nextInt(), sc.nextInt());
        }

        int minSquare = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;

            for(int j = 0; j < n; j++){
                if(j != i){
                    minX = Math.min(dots[j].x, minX);
                    minY = Math.min(dots[j].y, minY);
                    maxX = Math.max(dots[j].x, maxX);
                    maxY = Math.max(dots[j].y, maxY);
                }
            }

            int width = (maxX - minX) * (maxY - minY);

            minSquare = Math.min(width, minSquare);
        }

        System.out.println(minSquare);
    }
}