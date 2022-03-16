import java.util.Scanner;
import java.lang.*;

public class SumOfAllDigitsInAnInteger {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testCases =  sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int sum = 0;
            while(n != 0) {
                sum += n % 10;
                n = n/10;
            }
            System.out.println(sum);
        }
    }
}
