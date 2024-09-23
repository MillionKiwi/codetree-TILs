import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            xList.add(scanner.nextInt());
            yList.add(scanner.nextInt());
        }
        
        boolean possible = checkPossible(xList, yList);
        
        System.out.println(possible ? 1 : 0);
    }
    
    private static boolean checkPossible(List<Integer> xList, List<Integer> yList) {
        // x축에 평행한 직선 3개로 가능한 경우
        if (canCoverWithThreeLines(xList)) return true;
        
        // y축에 평행한 직선 3개로 가능한 경우
        if (canCoverWithThreeLines(yList)) return true;
        
        // x축에 평행한 직선 1개와 y축에 평행한 직선 2개로 가능한 경우
        for (int x : new HashSet<>(xList)) {
            List<Integer> remainingY = new ArrayList<>();
            for (int i = 0; i < xList.size(); i++) {
                if (xList.get(i) != x) {
                    remainingY.add(yList.get(i));
                }
            }
            if (canCoverWithTwoLines(remainingY)) return true;
        }
        
        // x축에 평행한 직선 2개와 y축에 평행한 직선 1개로 가능한 경우
        for (int y : new HashSet<>(yList)) {
            List<Integer> remainingX = new ArrayList<>();
            for (int i = 0; i < yList.size(); i++) {
                if (yList.get(i) != y) {
                    remainingX.add(xList.get(i));
                }
            }
            if (canCoverWithTwoLines(remainingX)) return true;
        }
        
        return false;
    }
    
    private static boolean canCoverWithThreeLines(List<Integer> coords) {
        return new HashSet<>(coords).size() <= 3;
    }
    
    private static boolean canCoverWithTwoLines(List<Integer> coords) {
        return new HashSet<>(coords).size() <= 2;
    }
}