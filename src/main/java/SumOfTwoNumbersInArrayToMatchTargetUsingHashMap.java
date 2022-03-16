import java.util.HashMap;
import java.util.Map;

class SumOfTwoNumbersInArrayToMatchTargetUsingHashMap {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arrMap = new HashMap<>();
        int[] result = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int pairNum = target - nums[i];
            if (arrMap.containsKey(pairNum)) {
                result[0] = i;
                result[1] = arrMap.get(pairNum);
            } else {
                arrMap.put(nums[i], i);
            }
        }
        return result;
    }
}