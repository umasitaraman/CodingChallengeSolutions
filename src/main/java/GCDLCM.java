import java.util.Scanner;

public class GCDLCM {

    //gcd calculation --> Euclidean algorithm or Euclid's algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        else
            return gcd (b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 12;
        int b = 24;
        int c = 36;
        /*System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();*/

        int gcd = 1;

        //GCD of 3 Given Nos.
        for(int i = 1 ; i <= a && i<=b && i<=c;i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                gcd = i;
            }
        }
        System.out.println("HCF : " + gcd);


    //LCM of 2 Nos. a & b  is (a * b)/GCD(a,b)

    //LCM of 3 given Nos.

        int lcm = ((a<b) ? ((a < c) ? a : c) : ((b < c) ? b : c));

        while (lcm % a != 0 || lcm % b != 0 || lcm % c != 0) {
            lcm++;
        }

        System.out.println("LCM : " + lcm);

        //Calculate Gcd and Lcm of Given Array
        int[] arr = {24, 48};
        lcm = arr[0];
        gcd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            gcd = gcd (gcd, arr[i]);

            lcm = (lcm * arr[i] / gcd ( lcm, arr[i]));
        }

        System.out.println("New GCD : " + gcd);
        System.out.println("NEW LCM : " + lcm);
    }
}
