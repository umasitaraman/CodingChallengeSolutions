public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums == null || nums.length ==0) return -1;
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }


        return nums[l];

    }


    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray fm = new FindMinimumInRotatedSortedArray();
        int[] nums = {11,13,15,17};
        System.out.println(fm.findMin(nums));

    }
}
