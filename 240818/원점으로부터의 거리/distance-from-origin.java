import java.util.*;
import java.lang.Math;

class Dot implements Comparable<Dot> {
    int distance, num;

    public Dot(int distance, int num){
        this.distance = distance;
        this.num = num;
    }
    @Override
    public int compareTo(Dot dot){
        if(this.distance == dot.distance){
            return this.num - dot.num;
        }
        return this.distance - dot.distance;
    }
    
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Dot[] dots = new Dot[n];

        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int distance = (int)Math.pow(x,2) + (int)Math.pow(y,2);
            dots[i] = new Dot(distance, i+1);
        }
        Arrays.sort(dots);
        for(int i =0; i<n; i++){
            System.out.println(dots[i].num);
        }
    }
}