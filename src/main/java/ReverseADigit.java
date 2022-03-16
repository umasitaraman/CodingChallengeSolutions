import java.util.Scanner;

public class ReverseADigit {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testCases =  sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            String reversed = "";
            int digit = 0;
            while(n != 0)  {
                digit = n % 10;
                reversed = reversed + digit;
                n = n/10;
            }
            System.out.println(Integer.parseInt(reversed));
        }
    }
}
