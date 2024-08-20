import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int[] blocks = new int[1000];

         for(int i = 0; i < 1000; i++){
            blocks[i] = 0;
         }

         for(int i = 0; i < n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j = start - 1; j < end; j++){
                blocks[j]++;
            }
         }

         int max = 0;
         for(int i = 0; i < n; i++){
            if(max < blocks[i]) max = blocks[i];
         }

         System.out.println(max);

         
    }
}