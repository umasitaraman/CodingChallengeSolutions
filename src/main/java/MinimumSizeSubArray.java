public class MinimumSizeSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int minRange = Integer.MAX_VALUE;


        for(int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            while(currentSum >= target) {
                minRange = Math.min(i + 1 - left , minRange);
                currentSum -= nums[left];
                left ++;
            }
        }
        return minRange;
    }

    public static void main(String[] args) {
       int[] nums = {2,3,1,2,4,3};
       int target = 7;
        MinimumSizeSubArray mssa = new MinimumSizeSubArray();
        System.out.println(mssa.minSubArrayLen(target, nums));
    }
}
