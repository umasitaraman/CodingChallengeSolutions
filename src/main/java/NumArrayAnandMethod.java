class NumArrayAnandMethod {

    int[] nums;
    int[] sumArray;

    public NumArrayAnandMethod(int[] nums) {
        this.nums =  new int[nums.length];
        System.arraycopy(nums, 0, this.nums, 0, nums.length);
        sumArray = new int[nums.length];
        sumArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumArray[i] = sumArray[i - 1] + nums[i];
        }

    }

    public void update(int index, int val) {
        nums[index] = val;
        if (nums.length > 1) {
            for (int i = index; i < nums.length; i++) {
                sumArray[i] = sumArray[i - 1] + nums[i];
            }
        } else {
            sumArray[index] = val;
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return sumArray[right];
        } else {
            return (sumArray[right] - sumArray[left - 1]);
        }

    }

    public static void main(String[] args) {
        int[] nums = {9,-8};
        NumArrayAnandMethod obj = new NumArrayAnandMethod(nums);
        int param_2 = obj.sumRange(0,0);
        System.out.println("param_2 : " + param_2);
        obj.update(0, 3);
        param_2 = obj.sumRange(0,0);
        System.out.println("param_2 : " + param_2);
        //["NumArray","update","sumRange","sumRange","update","sumRange"]
        //[[[9,-8]],[0,3],[1,1],[0,1],[1,-3],[0,1]]
    }
}