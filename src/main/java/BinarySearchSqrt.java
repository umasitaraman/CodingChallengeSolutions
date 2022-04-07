public class BinarySearchSqrt {
    public int mySqrt(int x) {

        if(x < 2) {
            return x;
        }

        long left = 0, right = x, mid = 0, ans = 0;

        while(left < right) {
            mid = left + (right - left) / 2;

            if((mid * mid) == x) {
                return (int) mid;
            } else if((mid * mid) > x) {
                right = mid;
            } else if((mid * mid) < x) {
                left = mid + 1;
            }
        }
        return (int) (left - 1);
    }

    public static void main(String[] args) {
        BinarySearchSqrt bss = new BinarySearchSqrt();
        System.out.println(bss.mySqrt(2147395599));
    }
}
