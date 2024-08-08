import java.util.*;

class Address {
    String name;
    String ad;
    String city;

    public Address(String name, String ad,String city){
        this.name = name;
        this.ad = ad;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    Address[] ads = {
        new Address(sc.next(), sc.next(), sc.next()),
        new Address(sc.next(), sc.next(), sc.next()),
        new Address(sc.next(), sc.next(), sc.next())
    }; 
    Address maxAddress = new Address("0","0","0");
    for(int i = 0; i < n; i++){
        if ((maxAddress.name.compareTo(ads[i].name)) < 0)  maxAddress = ads[i];
    }
    System.out.println("name " + maxAddress.name);
    System.out.println("addr " + maxAddress.ad);
    System.out.println("city " + maxAddress.city);
    }

}