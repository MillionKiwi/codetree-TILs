import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        List<Point> points = new ArrayList<>();
        Set<Integer> xCoords = new TreeSet<>();
        Set<Integer> yCoords = new TreeSet<>();
        
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
            xCoords.add(x - 1);
            xCoords.add(x + 1);
            yCoords.add(y - 1);
            yCoords.add(y + 1);
        }
        
        int minMaxPoints = N;
        
        for (int x : xCoords) {
            for (int y : yCoords) {
                if (x % 2 == 0 && y % 2 == 0) {
                    int[] quadrants = new int[4];
                    for (Point p : points) {
                        if (p.x < x && p.y < y) quadrants[0]++;
                        else if (p.x > x && p.y < y) quadrants[1]++;
                        else if (p.x < x && p.y > y) quadrants[2]++;
                        else if (p.x > x && p.y > y) quadrants[3]++;
                    }
                    int maxPoints = Math.max(Math.max(quadrants[0], quadrants[1]), 
                                             Math.max(quadrants[2], quadrants[3]));
                    minMaxPoints = Math.min(minMaxPoints, maxPoints);
                }
            }
        }
        
        System.out.println(minMaxPoints);
    }
    
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}