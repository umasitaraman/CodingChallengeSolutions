/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String first = sc.next();
            String second = sc.next();
            String third = sc.next();

            String[] preference = {first, second, third};

            String x = sc.next();
            String y = sc.next();

            System.out.println(Arrays.toString(preference));

            int index0 = Arrays.asList(preference).indexOf(x);
            int index1 = Arrays.asList(preference).indexOf(y);

            System.out.println(index0);
            System.out.println(index1);

            if (index0 < index1) {
                result[i] = x;
            } else {
                result[i] = y;
            }
        }
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }
}
