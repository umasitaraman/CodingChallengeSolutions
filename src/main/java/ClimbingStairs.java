import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    Map<Integer, Integer> numWaysCache = new HashMap<>();
    public int calculateNumberOFSteps (int n) {
        if (n <= 1) {
            return 1;
        }
        if (numWaysCache.containsKey(n)) {
            return numWaysCache.get(n);
        }

        int nthNumWay  =  calculateNumberOFSteps(n-1) + calculateNumberOFSteps(n-2);
        numWaysCache.put(n, nthNumWay);
        return nthNumWay;
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 4;
        System.out.println(cs.calculateNumberOFSteps(n));
    }
}
