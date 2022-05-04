import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) return nums;

        Map<Integer, Integer> isVisited = new HashMap<>();
        //List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(isVisited.containsKey(nums[i])) {
                isVisited.put (nums[i], isVisited.get(nums[i]) + 1);
            } else {
                isVisited.put (nums[i], 1);
            }
        }

        return isVisited.entrySet()
                .stream()
                .sorted((i1, i2) -> i2.getValue().compareTo(i1.getValue()))
                .limit(k)
                .map(entry -> entry.getKey())
                .mapToInt(x -> x)
                .toArray();
    }

    public static void main(String[] args) {

    }
}
