public class MaximumProductSubArray {

    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int finalOutput = nums[0];

        //nums = [2,3,-2,4]
        for (int i = 1; i < nums.length; i++) {
            int currentMaxProduct = maxProduct * nums[i];
            int currentMinProduct = minProduct * nums[i];
            minProduct = Math.min(nums[i], Math.min(currentMinProduct, currentMaxProduct));
            maxProduct = Math.max(nums[i], Math.max(currentMinProduct, currentMaxProduct));
            finalOutput = Math.max(nums[i], Math.max(finalOutput, maxProduct));
        }
        return finalOutput;
    }

    public static void main(String[] args) {
        int[] nums = {2,-5,-2,-4,3};
        MaximumProductSubArray mpa = new MaximumProductSubArray();
        System.out.println(mpa.maxProduct(nums));
    }

}
