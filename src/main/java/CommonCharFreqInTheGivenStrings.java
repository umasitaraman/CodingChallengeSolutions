import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CommonCharFreqInTheGivenStrings {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        int[] min_frequency = new int[26];
        Arrays.fill(min_frequency, Integer.MAX_VALUE);

        for (String current : words) {
            int[] char_frequency = new int[26];
            for (char c : current.toCharArray()) {
                char_frequency[c - 'a']++;
            }

            for (int i = 0; i< 26; i++) {
                min_frequency[i] = Math.min(min_frequency[i], char_frequency[i]);
            }
        }

        for (int i = 0 ; i < 26 ; i++) {
            while (min_frequency[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                min_frequency[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CommonCharFreqInTheGivenStrings sol = new CommonCharFreqInTheGivenStrings();
        String[] words = {"bella","label","roller"};
        //String[] words = {"cool","lock","cook"};
        System.out.println(sol.commonChars(words));
    }
}