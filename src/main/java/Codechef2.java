/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef2
{
    /*
    4
    aba
    abcd
    cbcdbef
    fabcdac
     */
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String[] newStr = str.split("");
            Arrays.sort(newStr);
            StringBuilder builder = new StringBuilder();
            for(String s : newStr) {
                builder.append(s);
            }
            str = builder.toString();
            System.out.println(str);
        }

    }
}
