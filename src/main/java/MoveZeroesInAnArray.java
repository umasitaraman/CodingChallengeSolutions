public class MoveZeroesInAnArray {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        int[] tmp = new int[nums.length - count];
        int cnt = 0;
        for (int i = 0; i < nums.length && cnt < (nums.length - count); i++) {
            if (nums[i] != 0) {
                tmp[cnt] = nums[i];
                cnt++;
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            nums[i] = tmp[i];
        }

        for (int i = tmp.length; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroesInAnArray m = new MoveZeroesInAnArray();
        int[] nums = {0,1,0,3,12};
        m.moveZeroes(nums);
    }
}
