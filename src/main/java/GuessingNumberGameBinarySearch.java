import java.util.Random;

public class GuessingNumberGameBinarySearch {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(1000);
        //int num = 500;
        System.out.println("num: " + num);
        int tries = 0;
        int l = 0;
        int r = 1000;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (m == num) {
                System.out.println("m : " +m);
                tries++;
                 break;
            } else if (m < num) {
                l = m + 1;
                System.out.println("m : " +m);
                System.out.println("l : " +l);
                tries ++;
            } else {
                r = m - 1;
                System.out.println("m : " +m);
                System.out.println("r : " +r);
                tries ++;
            }
        }
        System.out.println("Tries : " +tries);
    }
}
