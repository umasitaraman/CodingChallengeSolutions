
public class TwoDMatrixAddition {

    int matrixElementsSum(int[][] matrix) {
        int[][] skipIndex = new int[matrix.length][matrix[0].length];
        int sum = 0;
        for (int i =0; i <= matrix.length-1; i++) {
            for (int j = 0; j <= matrix[0].length-1; j++) {
                if (i < matrix.length-1 && matrix[i][j] == 0) {
                    matrix[i+1][j] = 0;
                }
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }


    public static void main (String[] args) {

        TwoDMatrixAddition ghost = new TwoDMatrixAddition();

        int[][] matrix = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
        System.out.println( ghost.matrixElementsSum(matrix));
    }
}
