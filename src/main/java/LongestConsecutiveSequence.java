import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {
            unique.add(num);
        }

        for(int i = 0; i < nums.length; i++) {
            if(unique.contains(nums[i] + 1)) {

            }
        }

        System.out.println(unique);
        return 0;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lc = new LongestConsecutiveSequence();
        int[] nums = {100,4,200,1,3,2};
        System.out.println(lc.longestConsecutive(nums));
    }
}
