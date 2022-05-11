public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int targetLength = s1.length();

        int start = 0;
        int end = start + targetLength - 1;

        while (start <= s2.length() - targetLength) {
            String partString = s2.substring(start, end + 1);
            if(isAnagram(s1, partString)) {
                return true;
            }
            start++;
            end++;
        }
        return false;
    }

    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        if(s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PermutationInString ps = new PermutationInString();
        System.out.println(ps.checkInclusion("adc","dcda"));
    }
}
