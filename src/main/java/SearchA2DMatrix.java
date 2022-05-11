public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
                int low = 0;
                int high = matrix[i].length - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (matrix[i][mid] == target) return true;

                    else if (matrix[i][mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        SearchA2DMatrix s2dm = new SearchA2DMatrix();
        System.out.println(s2dm.searchMatrix(nums, target));
    }
}



// Recursive solution
//
// public boolean searchMatrix(int[][] matrix, int target) {
//
//        for (int i = 0; i < matrix.length; i++) {
//            int[] row = matrix[i];
//            if (row[row.length - 1] >=  target) {
//                return recSearch(row, target, 0, row.length - 1);
//            }
//        }
//        return false;
//    }
//
//    boolean recSearch(int[] nums, int target, int l, int h) {
//        if (l > h) return false;
//
//        int mid = l + (h - l) / 2;
//
//        if (nums[mid] == target) return true;
//
//        if(nums[mid] > target) {
//            h = mid - 1;
//        } else {
//            l = mid + 1;
//        }
//
//        return recSearch (nums, target, l, h);
//    }

//  Alternative Solution
// public boolean searchMatrix(int[][] matrix, int target) {
//      int i = 0, j = matrix[0].length - 1;
//      while(i < matrix.length && j >= 0) {
//        if(matrix[i][j] == target)
//          return true;
//        else if(matrix[i][j] > target)
//          j --;
//        else if(matrix[i][j] < target)
//          i ++;
//      }
//      return false;
