import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int pointer = 0;

        while(start < end && pointer <=  end) {
            if (nums[pointer] == 0) {
                nums[pointer] = nums[start];
                nums[start] = 0;
                start++;
                pointer++;
            } else if(nums[pointer] == 2) {
                nums[pointer] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                pointer++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
