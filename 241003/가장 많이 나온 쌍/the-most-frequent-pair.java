import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        

        Map<String, Integer> pairCount = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
       
            String pair = a < b ? a + "," + b : b + "," + a;
            

            pairCount.put(pair, pairCount.getOrDefault(pair, 0) + 1);
        }
        

        int maxCount = 0;
        for (int count : pairCount.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        System.out.println(maxCount);
        
        sc.close();
    }
}