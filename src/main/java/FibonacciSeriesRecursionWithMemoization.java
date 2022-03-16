import java.util.Arrays;

class FibonacciSeriesRecursionWithMemoization
{
    private static long[] fibanacciCache;

    public static void main (String args[])
    {

        int n = 5;
        fibanacciCache = new long[n + 1];
        System.out.println(fibonacci(n));
//        for (int i = 0; i <=n ; i ++) {
//            System.out.print(fibonacci(i) +" ");
//        }
       System.out.println(Arrays.toString(fibanacciCache));
    }

    static long fibonacci(int n)
    {
        if (n <= 1) {
            return n;
        }
        if (fibanacciCache[n] != 0) {
            return fibanacciCache[n];
        }

        long nthFibonacciNumber  =  fibonacci(n-1) + fibonacci(n-2);
        fibanacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}