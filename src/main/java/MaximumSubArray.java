public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if(currentSum > maxSum) {
                maxSum = currentSum;
            } else if(nums[i] > maxSum) {
                maxSum = nums[i];
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray msa = new MaximumSubArray();
        System.out.println(msa.maxSubArray(nums));
    }
}
