import java.util.*;

class MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int count = 1;
        int compareNo = len / 3;
        int first = nums[0];
        Set<Integer> result = new HashSet<>();
        if(len == 1) {
            result.add(first);
        }
        for (int i = 1; i < len; i++) {
            if (first == nums[i]) {
                count ++;
            } else {
                first = nums[i];
                count = 1;
            }

            if (count > compareNo && !result.contains(nums[i - 1])) {
                result.add(nums[i - 1]);
                count = 1;
            }
        }
        if (count > compareNo && !result.contains(nums[len -1])) {
            result.add(nums[len - 1]);
        }
        List<Integer> finalResult = new ArrayList<>(result);
        return finalResult;
    }

    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();
        int[] nums = {1,1,2,2,1,1,1,1,2,2,1,1};
        System.out.println(sol.majorityElement(nums));
    }
}