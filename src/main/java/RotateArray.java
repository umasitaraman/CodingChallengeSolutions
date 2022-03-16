import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1){
            return;
        }
        //step each time to move
        int step = k % nums.length;
        int[] tmp = new int[step];
        for(int i = 0; i < step; i++){
            tmp[i] = nums[nums.length - step + i];
        }
        for(int i = nums.length - step - 1; i >= 0; i--){
            nums[i + step] = nums[i];
        }
        for(int i = 0; i < step; i++){
            nums[i] = tmp[i];
        }
        System.out.println(Arrays.toString(nums));


//        if(nums.length <= 1){
//            return;
//        }
//        //step each time to move
//        int step = k % nums.length;
//        int[] tmp = new int[step];
//        for(int i = 0; i < step; i++){
//            tmp[i] = nums[nums.length - step + i];
//        }
//        for(int i = nums.length - step - 1; i >= 0; i--){
//            nums[i + step] = nums[i];
//        }
//        for(int i = 0; i < step; i++){
//            nums[i] = tmp[i];
//        }
//        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        //Output: [5,6,7,1,2,3,4]
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        r.rotate(nums, k);
    }
}
