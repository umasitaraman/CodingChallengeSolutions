import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> charCount = new HashMap<>();

        int result = 0;
        int start = 0;

        for (int end  = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            charCount.put(endChar, (charCount.getOrDefault(endChar, 0) + 1));
            while ((end - start) + 1 - Collections.max(charCount.values()) > k) {
                char startChar = s.charAt(start);
                charCount.put(startChar, (charCount.get(endChar) - 1));
                start = start + 1;
            }
            result = Math.max(result , end - start + 1);
        }
        return result;
    }
}
