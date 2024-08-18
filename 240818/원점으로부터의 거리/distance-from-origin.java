import java.util.*;
import java.lang.Math;

class Dot implements Comparable<Dot> {
    int x, y, num;
    double distance;

    public Dot(int x, int y, int num){
        this.x = x;
        this.y = y;
        this.distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        this.num = num;
    }
    @Override
    public int compareTo(Dot dot){
        if(this.distance == dot.distance)   return this.num - dot.num;
        return (int)(this.distance - dot.distance);
    }
    
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Dot[] dots = new Dot[n];

        for(int i = 0; i<n; i++){
            dots[i] = new Dot(sc.nextInt(), sc.nextInt(), i+1);
        }
        Arrays.sort(dots);
        for(int i =0; i<n; i++){
            System.out.println(dots[i].num);
        }
    }
}