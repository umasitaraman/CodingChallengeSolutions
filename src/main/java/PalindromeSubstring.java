import java.nio.charset.StandardCharsets;

public class PalindromeSubstring {

    public int countSubstrings(String s) {
        int left = 0;
        int right = 1;
        int count = 0;

        while (left < s.length() && left <= right && right < s.length()) {
            if(isPalindrome(s.substring(left, right))) {
                count++;
                right++;
            } else if (left < s.length() && right == s.length() - 1) {
                left++;
                right = left + 1;
            } else if (left < s.length() - 1) {
                count++;
            } else {
                right++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String str) {
        if(str.length() == 1) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abc";
        PalindromeSubstring ps = new PalindromeSubstring();
        System.out.println(ps.countSubstrings(str));
    }


}
