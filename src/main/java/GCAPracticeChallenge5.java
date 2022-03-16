import java.util.Arrays;

public class GCAPracticeChallenge5 {
    long solution(int[] arr) {
        int[] newArr = new int[arr.length];
        int result;
        int count = 0;
        StringBuilder[] sb = new StringBuilder[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sb[i] = new StringBuilder(String.valueOf(arr[i]));
        }
        for (int j = 0; j < sb.length; j++) {
            String str = String.valueOf(sb[j].reverse());
            System.out.println(str);
            for (int k = 0; k < str.length(); k++) {
                if(str.charAt(k) == '0') {
                    count++;
                }
            }
            System.out.println(count);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {58100};
        GCAPracticeChallenge5 g = new GCAPracticeChallenge5();
        g.solution(arr);
    }
}
