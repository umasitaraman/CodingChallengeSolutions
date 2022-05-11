import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();

        int start = 0;
        int end = start + k - 1;

        while (start <= nums.length - k) {
            int[] subArray = Arrays.copyOfRange(nums, start, start + k);
            result.add(Arrays.stream(subArray).max().getAsInt());
            start++;
            end++;
        }
        return result.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        SlidingWindowMaximum swm = new SlidingWindowMaximum();
        System.out.println(Arrays.toString(swm.maxSlidingWindow(nums, k)));

    }
}
