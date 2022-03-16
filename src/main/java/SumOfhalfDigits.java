public class SumOfhalfDigits {
    boolean isLucky(int n) {
        String num = String.valueOf(n);
        int length = String.valueOf(n).length();
        int front = 0;
        int back = 0;
        
        for (int i = 0; i < length/2 ; i++ ) {
            front = front + Integer.parseInt(String.valueOf(num.charAt(i)));
            back = back + Integer.parseInt(String.valueOf(num.charAt(length - (i+1))));
        }

        if (front == back) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int n = 1234;
        SumOfhalfDigits p = new SumOfhalfDigits();
        System.out.println(p.isLucky(n));
    }
}
