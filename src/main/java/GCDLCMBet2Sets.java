/**
 * There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
 *
 * The elements of the first array are all factors of the integer being considered
 * The integer being considered is a factor of all elements of the second array
 * These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
 */
import java.util.*;

public class GCDLCMBet2Sets {

    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {100};
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            arr.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            brr.add(arr2[i]);
        }
        int total = GCDLCMBet2Sets.getTotalX(arr, brr);
        System.out.println(String.valueOf(total));

    }

    public static boolean allDivisibleFac(int num, List<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            if (num % a.get(i) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean allDivisibleMul(int num, List<Integer> b) {
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) % num != 0) {
                return false;
            }
        }
        return true;
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        Collections.sort(a);
        Collections.sort(b);

        //int num = 1;
        int count = 0;
        //List<Integer> numArray = new ArrayList<>();
        /*for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j <= b.get(b.size()-1) && num <= b.get(b.size()-1) ; j++ ) {
                if (allDivisibleFac(num, a)) {
                    if (!numArray.contains(num)) {
                        numArray.add(num);
                    }
                }
                num ++;
            }
        }

            for (int val : numArray) {
                if (allDivisibleMul(val, b)) {
                    count ++;
                }
        }*/
        for (int i = a.get(a.size() - 1); i <= b.get(0); i++) {
            if (allDivisibleFac(i, a) && allDivisibleMul(i, b)) {
                count++;
            }
        }
        return count;
    }
}
