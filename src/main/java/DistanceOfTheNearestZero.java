import java.util.Arrays;

public class DistanceOfTheNearestZero {

    public static int[][] updateMatrix(int[][] mat) {

        int[][] result = new int[mat.length][mat[0].length];

        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i + 1 < mat.length && j + 1 < mat[0].length && i - 1 > 0 && j - 1 > 0) {
                    if(mat[i][j + 1] == 0 && mat[i + 1][j] == 0) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = 1;
                    }
                }

            }
        }

        return result;
    }

    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        print2D(updateMatrix(mat));
    }
}



