import java.util.Arrays;

/**
 * n ∗ 1/2 ∗ 1/2 ∗ 1/2 .... = 1
 *
 * How many 1/2 's are there? We don't know yet, but we can call that number x:
 *
 * n * (1/2)^x = 1
 *
 * Now we solve for xx:
 *
 * n * (1^x)/(2^x) = 1
 * n / (2^x) = 1
 * n = (2^x)
 * Now to get the x out of that exponent! We'll use the same trick as last time.
 *
 * Take the log to the base 2 of both sides...
 *
 * log n = log (2^x)
 * log n = x log (2) (Since it is log 2 to the base 2 it would equate to 1)
 * log n = x
 * So there it is. The total time cost of binary search is O(log n)
 */
public class BinarySearchImplementation {
    public int search(int[] nums, int target) {
        int l = 0 , r = nums.length - 1 , mid , ans = -1;

        while(l <= r) {
            mid = l + (r - l) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                r = mid - 1;
                //ans = mid;
            } else {
                l = mid + 1;
                //ans = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        BinarySearchImplementation b = new BinarySearchImplementation();
        System.out.println(b.search(nums, target));
    }
}
