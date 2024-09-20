import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int[] newArr = new int[n - 1];
                int index = 0;
                for (int k = 0; k < n; k++) {
                    if (k == j) continue;
                    newArr[index++] = (k == i) ? arr[k] * 2 : arr[k];
                }

                int difference = calculateDifference(newArr);
                minDifference = Math.min(minDifference, difference);
            }
        }

        System.out.println(minDifference);
    }

    private static int calculateDifference(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += Math.abs(arr[i] - arr[i - 1]);
        }
        return sum;
    }
}