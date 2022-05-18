import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowValues = new HashSet<>();
        Set<Integer> colValues = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowValues.add(i);
                    colValues.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowValues.contains(i) || colValues.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
