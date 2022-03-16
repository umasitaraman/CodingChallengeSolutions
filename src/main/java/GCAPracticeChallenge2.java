import java.util.ArrayList;
import java.util.List;

/**
 * You are given two strings pattern and s. The first string pattern contains only the symbols 0 and 1, and the second string s contains only lowercase English letters.
 *
 * Let's say that pattern matches a substring s[l..r] of s if the following 3 conditions are met:
 *
 * they have equal length;
 * for each 0 in pattern the corresponding letter in the substring is a vowel;
 * for each 1 in pattern the corresponding letter is a consonant.
 * Your task is to calculate the number of substrings of s that match pattern.
 *
 * Note: In this task we define the vowels as 'a', 'e', 'i', 'o', 'u', and 'y'. All other letters are consonants.
 *
 * Example
 *
 * For pattern = "010" and s = "amazing", the output should be solution(pattern, s) = 2.
 * Expand to see the example video.
 *
 * "010" matches s[0..2] = "ama", because both 0s match a, which is a vowel, and 1 match m, which is a consonant;
 * "010" doesn't match s[1..3] = "maz", because the first 0 corresponds to an m, which is a consonant, not a vowel;
 * "010" matches s[2..4] = "azi", because the first 0 matches an a (vowel), 1 matches z (consonant), and the second 0 matches i (vowel);
 * "010" doesn't match s[3..5] = "zin", because the first 0 corresponds to a consonant (z);
 * "010" doesn't match s[4..6] = "ing", because the second 0 corresponds to the letter g, which is a consonant.
 * So, there are only 2 matches.
 *
 * For pattern = "100" and s = "codesignal", the output should be solution(pattern, s) = 0.
 *
 * There are no double vowels in the string "codesignal", so it's not possible for any of its substrings to match this pattern.
 */
public class GCAPracticeChallenge2 {
    int solution(String pattern, String s) {
        int result = 0;

        List<Character> vowels=new ArrayList<Character>(){{
            add('a'); add('e'); add('i'); add('o'); add('u'); add('y');
        }};
        for (int i = 0; i + pattern.length() - 1 < s.length(); i++) {
            List<Boolean> isAMatch = new ArrayList<>();
            for (int j = 0; j < pattern.length(); j++) {
                if(pattern.charAt(j) == '0' && vowels.contains(s.charAt(i + j)) || pattern.charAt(j) == '1' && !vowels.contains(s.charAt(i + j))) {
                    isAMatch.add(true);
                } else if(pattern.charAt(j) == '0' && !vowels.contains(s.charAt(i + j))) {
                    isAMatch.add(false);
                } else {
                    isAMatch.add(false);
                }
            }
            if (isAMatch.contains(false)) {
                continue;
            } else {
                result++;
            }
        }
        return result;
    }


}
