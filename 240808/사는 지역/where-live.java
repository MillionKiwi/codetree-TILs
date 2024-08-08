import java.util.Scanner;

class people{

    String name;
    String number;
    String city;

    public people(String name,String number,String city){
        this.name = name;
        this.number = number;
        this.city = city;
    }
}



public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        people[] word = new people[n];

        for(int i = 0 ; i<n; i++){
            String name = sc.next();
            String number = sc.next();
            String city = sc.next();

            word[i] = new people(name,number,city);
        }

        int min_val = 0;

        for(int i = 1; i<n; i++){
            if (word[i].name.compareTo(word[min_val].name)>0){
                min_val = i;
            }
        }
        System.out.println("name "+word[min_val].name);
        System.out.println("addr "+word[min_val].number);
        System.out.println("city "+word[min_val].city);
    }
}