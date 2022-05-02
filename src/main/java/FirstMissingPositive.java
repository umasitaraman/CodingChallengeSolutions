public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                nums[i] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if(index >= 0 && index < nums.length && nums[index] >= 0) {
                nums[index] = -(nums[index]);
                if(nums[index] == 0) {
                    nums[index] = -(nums.length + 1);
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,2};
        FirstMissingPositive fmp = new FirstMissingPositive();
        System.out.println(fmp.firstMissingPositive(nums));
    }
}
