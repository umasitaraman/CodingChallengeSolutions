import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangeLeetCode {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        result.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = new ArrayList<>(result.get(i));
            List<Integer> curr_row = new ArrayList<>();
            curr_row.add(1);
            for(int j = 1; j < i; j++) {
                curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            curr_row.add(1);
            result.add(curr_row);
        }
        return result;
    }

    public static void main(String[] args) {
        int numOfRows = 5;
        PascalTriangeLeetCode pt = new PascalTriangeLeetCode();
        System.out.println(pt.generate(numOfRows));
    }

}
