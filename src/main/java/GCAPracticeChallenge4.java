import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GCAPracticeChallenge4 {
    boolean[] solution(int[] a, int l, int r) {

        List<Boolean> b = new ArrayList<>();

        for (int i =0; i < a.length; i++) {
            int x = a[i] / (i + 1);
            if(a[i] % (i + 1) == 0 && x >= l && x <= r) {
                b.add(true);
            } else {
                b.add(false);
            }
        }

        boolean[] arr = new boolean[b.size()];
        for (int i = 0; i < b.size(); i++) {
            arr[i] = b.get(i);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        GCAPracticeChallenge4 g =  new GCAPracticeChallenge4();
        int[] arr = {100};
        int l = 1;
        int r = 1000;
        g.solution(arr,l,r);
    }

}
