import java.util.*;
import java.lang.*;
import java.io.*;

public class CountNoOfFoursInAnInteger {

    public static void main (String[] args) throws java.lang.Exception {
            // your code goes here
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int digit = 0;
            int count = 0;
            while (n !=0) {
                digit = n % 10;
                if (digit == 4) {
                    count ++;
                }
                n = n/10;
            }
            System.out.println(count);
        }
    }

}
