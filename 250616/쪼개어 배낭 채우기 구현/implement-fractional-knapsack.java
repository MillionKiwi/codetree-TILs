import java.util.*;
import java.io.*;


public class Main {
    static class Jewerly{
        int weight;
        int value;
        double valuePerWeight;

        public Jewerly(int weight, int value){
            this.weight = weight;
            this.value = value;
            this.valuePerWeight = (double) value/weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Jewerly[] jewerlys = new Jewerly[n];

        for (int i = 0; i < n; i++) {
            jewerlys[i] = new Jewerly(sc.nextInt(), sc.nextInt());
        }

        double totalValue = steel(jewerlys, m);
        System.out.println(String.format("%.3f", totalValue));
       
    }

    public static double steel(Jewerly[] jewerlys, int bagSize){
        Arrays.sort(jewerlys, Comparator.comparingDouble((Jewerly jewerly) -> jewerly.valuePerWeight).reversed());

        double totalValue = 0;

        for (Jewerly jew : jewerlys){
            if(bagSize >= jew.weight){
                totalValue += jew.value;
                bagSize -= jew.weight;
            }
            else{
                //쪼갤 비율 설정
                double fraction = (double) bagSize/jew.weight;
                totalValue += jew.value * fraction;
                bagSize = 0;
            }
            if(bagSize == 0) break;
        }

        return totalValue;
    }
}