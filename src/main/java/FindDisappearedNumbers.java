import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindDisappearedNumbers {
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
        // We reach here when element is not present
        // in array
        return -1;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <=n; i++) {
            int output = binarySearch(nums, 0, n - 1, i);
            if(output == -1) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindDisappearedNumbers sol = new FindDisappearedNumbers();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(sol.findDisappearedNumbers(nums));
    }
}