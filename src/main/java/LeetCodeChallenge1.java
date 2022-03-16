public class LeetCodeChallenge1 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        if (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion (int n) {
        if (n <= 4) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCodeChallenge1 l = new LeetCodeChallenge1();
        System.out.println(l.firstBadVersion(10));
    }
}