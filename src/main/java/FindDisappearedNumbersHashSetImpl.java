import java.util.*;

class FindDisappearedNumbersHashSetImpl {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> numsSet = new TreeSet<>();
        int n = nums.length;
        for (Integer t:nums){
            numsSet.add(t);
        }
        for (int i = 1; i <= n ; i++) {
            if(!numsSet.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindDisappearedNumbers sol = new FindDisappearedNumbers();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(sol.findDisappearedNumbers(nums));
    }
}