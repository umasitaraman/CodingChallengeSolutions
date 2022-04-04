import java.math.BigDecimal;

public class SumOfTwoIntegersWithoutUsingTheOperators {
    public int getSum(int a, int b) {
        BigDecimal aBigdecimal = BigDecimal.valueOf(a);
        BigDecimal bBigdecimal = BigDecimal.valueOf(b);
        return aBigdecimal.add(bBigdecimal).intValue();
    }

    public static void main(String[] args) {
        SumOfTwoIntegersWithoutUsingTheOperators sum = new SumOfTwoIntegersWithoutUsingTheOperators();
        System.out.println(sum.getSum(3, 5));
    }
}
