public class CheckIfPalindrome {

    boolean checkPalindrome(String inputString) {
        int strLength = inputString.length();
        for (int i = 0; i < inputString.length()/2; i++) {
            if (inputString.charAt(i) == inputString.charAt(strLength-1)) {
                strLength -= 1;
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfPalindrome s = new CheckIfPalindrome();
        System.out.println(s.checkPalindrome("blue"));
    }
}
