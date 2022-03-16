import java.util.Arrays;

public class HeightCheckerLeetCode {
    public int heightChecker(int[] heights) {
        int[] expectedArray = Arrays.copyOf(heights, heights.length);
        int swapCount = 0;
        Arrays.sort(expectedArray);
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != expectedArray[i]) {
                swapCount++;
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        int[] heights = {5,1,2,3,4};
        HeightCheckerLeetCode hc = new HeightCheckerLeetCode();
        System.out.println(hc.heightChecker(heights));
    }
}
