import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int offset = 100;

         int[] blocks = new int[250];

         for(int i = 0; i < 250; i++){
            blocks[i] = 0;
         }

         for(int i = 0; i < n; i++){
            int start = sc.nextInt() + offset;
            int end = sc.nextInt() + offset;

            for(int j = start - 1; j < end - 1; j++){
                blocks[j]++;
            }
         }

         int max = 0;
         for(int i = 0; i < 250; i++){
            if(max < blocks[i]) max = blocks[i];
         }

         System.out.println(max);

         
    }
}