import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
         Scanner sc = new Scanner(System.in);
         int n = 100;
         int k = sc.nextInt();

         int[] blocks = new int[n];

         for(int i = 0; i < n; i++){
            blocks[i] = 0;
         }

         for(int i = 0; i < k; i++){
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