import java.util.Scanner;


class Agent{
    String name;
    int grade;

    public Agent(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan = new Scanner(System.in);
        String n1, n2, n3, n4, n5;
        int g1, g2, g3, g4, g5;

        n1 = scan.next();
        g1 = scan.nextInt();
        n2 = scan.next();
        g2 = scan.nextInt();
        n3 = scan.next();
        g3 = scan.nextInt();
        n4 = scan.next();
        g4 = scan.nextInt();
        n5 = scan.next();
        g5 = scan.nextInt();

        Agent[] agents = new Agent[]{
            new Agent(n1,g1),
            new Agent(n2,g2),
            new Agent(n3,g3),
            new Agent(n4,g4),
            new Agent(n5,g5)
        };
        Agent minAgent = agents[0];
        for(int i = 0; i < 5; i++){
            if (agents[i].grade < minAgent.grade){
                minAgent = agents[i];
            }
        }

        System.out.println(minAgent.name + " " + minAgent.grade);
    }
}