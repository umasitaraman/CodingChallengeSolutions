public class IsValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder originalStr = new StringBuilder();
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if(Character.isLetter(c) || Character.isDigit(c)) {
                str.append(Character.toLowerCase(c));
                originalStr.append(Character.toLowerCase(c));
            }
        }
        if(originalStr.toString().equals(str.reverse().toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
