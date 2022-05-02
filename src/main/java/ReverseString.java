import java.util.Arrays;

public class ReverseString {

    public String reverseString(String str) {
        char[] strArray = str.toCharArray();
        int l = 0;
        int r = str.length() - 1;
        char temp;
        while (l < r) {
            temp = strArray[l];
            strArray[l] = strArray[r];
            strArray[r] = temp;
            l++;
            r--;
        }
        return new String(strArray);
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("civic"));
    }
}
