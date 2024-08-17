import java.util.*;

class Student implements Comparable<Student> {
    int number, height, weight;

    public Student (int number, int height, int weight){
        this.number = number;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(student.height == this.height){
            if(student.weight == this.weight){
                return student.number - this.number;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            students[i] = new Student(i+1, sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(students);
        for(int i = 0; i < n; i++){
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].number);
        }
    
    }
}