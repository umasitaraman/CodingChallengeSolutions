public class SearchInRotatedSortedArray {
    // Input: nums = [4,5,6,7,8,1,2], target = 0
    // Output: 4

    public int search(int[] nums, int target) {

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

        int start = l;
        l = 0;
        r = nums.length - 1;

        if(target >= nums[start] && target<= nums[r]) {
            l = start;
        } else {
            r = start;
        }

        while (l <= r) {
            int m = l + (r - l) / 2;
            if(nums[m] == target) {
                return m;
            } else if(nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray sira = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(sira.search(nums, target));
    }
}
