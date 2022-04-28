public class FindPeakElement {

    public int findPeakElement(int[] nums) {

        if(nums == null || nums.length == 0)
            return -1;

        int l = 0, r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if(nums[m] < nums[m+1]) {
                l = m + 1;
            } else
                r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        FindPeakElement fpe = new FindPeakElement();
        System.out.println(fpe.findPeakElement(nums));
    }
}
