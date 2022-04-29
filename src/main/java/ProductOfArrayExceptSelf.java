import java.util.Arrays;

public class ProductOfArrayExceptSelf {


    public int[] productExceptSelf(int[] nums) {
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];
        int[] outputProducts = new int[nums.length];
        int product = 1;

        for(int i = 0; i < nums.length; i++) {
            leftProducts[i] = product;
            product *= nums[i];
        }

        product = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            rightProducts[i] = product;
            product *= nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            outputProducts[i] = leftProducts[i] * rightProducts[i];
        }
        return outputProducts;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        ProductOfArrayExceptSelf prod = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(prod.productExceptSelf(nums)));
    }

}
