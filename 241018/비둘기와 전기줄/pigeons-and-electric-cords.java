import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Map<Integer, Integer> lastPosition = new HashMap<>();
        int crossings = 0;

        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int position = sc.nextInt();

            if (lastPosition.containsKey(pigeon) && lastPosition.get(pigeon) != position) {
                crossings++;
            }
            lastPosition.put(pigeon, position);
        }

        System.out.println(crossings);
    }
}