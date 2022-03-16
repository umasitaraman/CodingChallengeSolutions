class NumArray {

    private static int[] nums;
    private static int[] sumArray;
    int n;

    public NumArray(int[] nums) {
        this.nums =  nums;
        this.n = nums.length;
        this.sumArray = new int[n + 1];

    }

    public void update(int index, int val) {
        nums[index] = val;
    }

    public int sumRange(int left, int right) {

        if(left == right) {
            return nums[left];
        }
        if ((right - left) == 1) {
            return nums[right] + nums[left];
        }
        //return nums[left] + nums[right] + sumRange(left + 1, right - 1);
        int nthSum  =  nums[left] + nums[right] + sumRange(left + 1, right - 1);
        sumArray[n] = nthSum;
        return nthSum;



    }
}