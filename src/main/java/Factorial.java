import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Factorial {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int testCases =  sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            BigInteger factorial = new BigInteger("1");

            while (n >= 2) {
                factorial = factorial.multiply(BigInteger.valueOf(n));
                n--;
            }
            System.out.println(factorial);
        }
    }
}
