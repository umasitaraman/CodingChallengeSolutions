import java.util.Arrays;

public class MutateArray {

    /**
     * Given an integer n and an array a of length n, your task is to apply the following mutation to a:
     *
     * Array a mutates into a new array b of length n.
     * For each i from 0 to n - 1, b[i] = a[i - 1] + a[i] + a[i + 1].
     * If some element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, it should be set to 0.
     * For example, b[0] should be equal to 0 + a[0] + a[1].
     *
     */

    int[] mutateTheArray(int n, int[] a) {

        int[] b  = new int[n];

        for (int i = 0 ; i <= n - 1; i++) {

            if (i == 0) {
                if((i+1) >= n) {
                    b[i] = 0 + a[i] + 0;
                }
                else {
                    b[i] = 0 + a[i] + a[i + 1];
                }
            }
            else if ((i+1) >= n) {
                b[i] = a[i - 1] + a[i] + 0;
            }
            else {
                b[i] = a[i - 1] + a[i] + a[i + 1];
            }
        }

        return b;
    }

    public static void main (String[] args) {

        int n = 5;
        int[] a = {4, 0, 1, -2, 3};

        MutateArray m = new MutateArray();
        System.out.println(Arrays.toString(m.mutateTheArray(n,a)));
    }
}
