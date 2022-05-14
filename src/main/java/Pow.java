public class Pow {
    public double myPow(double x, int n) {
        double result = product(x, Math.abs(n));

        return (n < 0) ? 1/result : result;
    }

    public double product(double x, int n) {
        if(n == 0) return 1;
        if(x == 0) return 0;

        double res = product(x, n / 2);

        return (n % 2 == 0) ? (res * res) : (x * res * res);
    }

    public static void main(String[] args) {
        Pow sol = new Pow();
        double x = 2.00000;
        int n = 10;
        System.out.println(sol.myPow(x, n));
    }
}
