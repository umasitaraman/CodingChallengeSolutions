import java.util.Arrays;
import java.util.List;

public class CommonCharCnt {

    int commonCharacterCount(String s1, String s2) {
        // To store the frequencies of characters
        // of string s1 and s2

        int n1 = s1.length(), n2 = s2.length();

        int []freq1 = new int[26];
        int []freq2 = new int[26];
        Arrays.fill(freq1, 0);
        Arrays.fill(freq2, 0);

        // To store the count of valid pairs
        int i, count = 0;

        // Update the frequencies of
        // the characters of string s1
        for (i = 0; i < n1; i++)
            freq1[s1.charAt(i) - 'a']++;

        // Update the frequencies of
        // the characters of string s2
        for (i = 0; i < n2; i++)
            freq2[s2.charAt(i) - 'a']++;

        // Find the count of valid pairs
        for (i = 0; i < 26; i++)
            count += (Math.min(freq1[i], freq2[i]));
        return count;
    }
    public static void main(String[] args) {

        String s1 = "aabcc";
        String s2 = "adcaa";
        CommonCharCnt p = new CommonCharCnt();
        System.out.println(p.commonCharacterCount(s1,s2));
    }
}
