import java.util.Scanner;

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
    int minAds = 0;
    for(int i = 0; i < n; i++){
        if (ads[i].name.compareTo(ads[minAds].name) > 0)  minAds = i;
    }
    System.out.println("name " + ads[minAds].name);
    System.out.println("addr " + ads[minAds].ad);
    System.out.println("city " + ads[minAds].city);
    }

}