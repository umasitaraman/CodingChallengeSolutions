import java.util.*;

public class MergeIntervals {
    //Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    //Output: [[1,6],[8,10],[15,18]]

    public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        List<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];

        for (int[] interval : intervals) {
            int currentBegin = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currentEnd > nextBegin) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }  else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8, 10}, {15, 18}};
        MergeIntervals mi = new MergeIntervals();
        System.out.println(Arrays.deepToString(mi.merge(intervals)));
    }
}
