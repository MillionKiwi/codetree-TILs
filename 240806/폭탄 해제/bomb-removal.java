import java.util.*;

class Line{
    String code;
    String color;
    int second;

    public Line(String code, String color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Line l = new Line(code,color,second);
        System.out.println("code : " + l.code);
        System.out.println("color : " + l.color);
        System.out.println("second : " + l.second);
    }
}