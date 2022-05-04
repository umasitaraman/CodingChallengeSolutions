public class TrappingRainWater {
    public static int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int maxWaterTrapped = 0;

        int maxHeight = 0;
        for (int i = 0; i < height.length; i++) {
            if(i == 0) {
                maxLeft[i] = 0;
            } else {
                maxHeight = Math.max(maxHeight, height[i - 1]);
                maxLeft[i] = maxHeight;
            }
        }

        maxHeight = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if(i == height.length - 1) {
                maxRight[i] = 0;
            } else {
                maxHeight = Math.max(maxHeight, height[i + 1]);
                maxRight[i] = maxHeight;
            }
        }

        for (int i = 0; i < height.length; i++) {
            maxWaterTrapped += Math.max((Math.min(maxLeft[i], maxRight[i]) - height[i]), 0);
        }
        return maxWaterTrapped;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

    }
}
