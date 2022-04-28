//import java.util.ArrayList;
//import java.util.List;
//
//public class SearchForARange {
//    public int[] searchRange(int[] nums, int target) {
//        int[] result = new int[] {-1, -1};
//        if (nums == null || nums.length == 0) {
//            return result;
//        }
//
//        int left = 0, right = nums.length - 1;
//        while (left + 1 < right){
//            // Prevent (left + right) overflow
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                 return mid;
//            } else if (nums[mid] < target) {
//                left = mid;
//            } else {
//                right = mid;
//            }
//        }
//
//        // Post-processing:
//        // End Condition: left + 1 == right
//        if(nums[left] == target) result[1] = left;
//        if(nums[right] == target) result[1] = right;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int nums[] = {5,7,7,8,8,10};
//        int target = 8;
//        SearchForARange sfr = new SearchForARange();
//        System.out.println(sfr.searchRange(nums, target));
//    }
//
//
//}
