import java.util.Scanner;

public class SumOfFirstAndLastDigitOfAnInteger {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testCases =  sc.nextInt();
        int first = 0;
        int last = 0;
        for (int i = 0; i < testCases; i++) {
            first = 0;
            int n = sc.nextInt();
            last = n % 10;
            while(n >= 10) {
                n = n / 10;
            }

            int sum = n + last;
            System.out.println("First : " + n + "\nLast : " + last);
            System.out.println("Sum: " + sum);
        }
    }
}
