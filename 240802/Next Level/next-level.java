import java.util.Scanner;

class Student{
    String id;
    int level;
    
    public Student(){
        this.id = "codetree";
        this.level = 10;
    }

    public Student(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan = new Scanner(System.in);

        String id = scan.next();
        int level = scan.nextInt();

        Student s1 = new Student();
        Student s2 = new Student(id, level);

        System.out.println("user " + s1.id +" lv " + s1.level);
        System.out.println("user " + s2.id +" lv " + s2.level);
    }
}