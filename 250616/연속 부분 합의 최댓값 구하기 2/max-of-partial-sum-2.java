import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.
        int current_sum = -1001;
        int max_sum = -1001;

        for(int i =0; i< N; i++){
            current_sum = Math.max(a[i],current_sum + a[i]);
            max_sum = Math.max(max_sum,current_sum);
        }

        System.out.println(max_sum);
    }
}