import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        Set<Character> unique = new HashSet<>();

        while(j < s.length()) {
            if(!unique.contains(s.charAt(j))) {
                unique.add(s.charAt(j));
                j++;
                max = Math.max(max, unique.size());
            } else {
                unique.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring(s));
    }
}
