import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        //[[1,2,3,11,  12, 13],
        // [4,5,6,14,  15, 16],
        // [7,8,9,17,  18, 19],
        // [27,28,29,37,38,39]
        List<Integer> result = new ArrayList<>();

        int left = 0;
        int right = matrix.length - 1;
        int top = 0;
        int bottom = matrix[0].length - 1;

        while (left <= right && top <= bottom) {
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[left][i]);
            }
            left++;

            for (int i = left; i <= right; i++) {
                result.add(matrix[i][bottom]);
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[right][i]);
                }
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[i][top]);
                }
            }

            top++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}};
        //Output: [1,2,3,4,8,12,11,10,9,5,6,7]
        SpiralMatrix sm = new SpiralMatrix();
        System.out.println(sm.spiralOrder(matrix));

    }
}
