import java.util.Arrays;

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
