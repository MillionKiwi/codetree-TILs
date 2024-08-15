import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student other) { // flag 매개변수 제거, Comparable 인터페이스의 compareTo 메서드 구현
        return this.name.compareTo(other.name); // 이름으로 기본 정렬
    }

    // 몸무게로 정렬하기 위한 Comparator 구현
    public static Comparator<Student> heightComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s2.height, s1.height); // 내림차순 정렬
        }
    };
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble()); // 생성자 호출 수정
        }

        Arrays.sort(students); // 이름으로 정렬
        System.out.println("name");
        for (Student student : students) { // 향상된 for loop 사용
            System.out.println(student.name + " " + student.height + " " + student.weight);
        }

        Arrays.sort(students, Student.heightComparator); // 몸무게로 정렬
        System.out.println("\nheight");
        for (Student student : students) {
            System.out.println(student.name + " " + student.height + " " + student.weight);
        }
    }
}