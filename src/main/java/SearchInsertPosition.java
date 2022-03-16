class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0 , r = nums.length - 1 , mid , ans = -1;

        while (l <= r) {
            mid = l + (r - l) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                r = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
                ans = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        int a[] = {1 , 3 , 5 , 7 , 9} , target = 4;
        System.out.println(s.searchInsert(a, target));
    }
}