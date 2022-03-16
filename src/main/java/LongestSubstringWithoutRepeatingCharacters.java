import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int lengthOfSubString = 0;
        List<String> longestSubstring = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(!longestSubstring.contains(s.charAt(i))) {
                longestSubstring.add(String.valueOf(s.charAt(i)));
            }
        }
        lengthOfSubString = longestSubstring.size();
        return lengthOfSubString;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        l.lengthOfLongestSubstring(s);
    }
}
