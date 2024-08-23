import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int max = 23;
        int[] blocks = new int[max];

        for(int i = 0; i < max; i++) blocks[i] = 0;

        int n = sc.nextInt();
        int now = max / 2;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("R")){
               for(int j = 0; j < x; j++){
                  blocks[now++]++;
               }
            }
            if(dir.equals("L")){
               for(int j = 0; j < x; j++){
                  blocks[--now]++;
               }
            }
            /*
            for(int k = 0; k < max; k++){
               System.out.print(blocks[k] + " ");
            }
            System.out.println("");
            System.out.println("now: " + (now - (max/2)));
            */
            
        }

        for(int i = 0; i < max; i++){
         if(blocks[i] > 1){
            cnt++;
         }
        }

        System.out.println(cnt);
    }
}