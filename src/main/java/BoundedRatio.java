public class BoundedRatio {

    /**
     * b[i] = true if there exists an integer x, such that a[i] = (i + 1) * x and l ≤ x ≤ r.
     * Otherwise, b[i] should be set to false.
     *
     */
    boolean[] boundedRatio(int[] a, int l, int r) {
        boolean[] output = new boolean[a.length];
        for(int i = 0; i < a.length; i++) {
            int x = (int) a[i] / (i+1);
            if ((a[i] == (i + 1) * x) && (x >= l && x <=r)) {
                output[i] = true;
            }
            else {
                output[i] = false;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        BoundedRatio s = new BoundedRatio();
        int []  a = {8, 5, 6, 16, 5};
        int l = 1;
        int r = 3;
        boolean[] retOutput = new boolean[a.length];
        retOutput = s.boundedRatio(a,l,r);
        for (int i = 0; i < a.length; i++){
            System.out.println(retOutput[i]);
        }


    }
}
