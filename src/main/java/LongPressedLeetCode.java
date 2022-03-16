import java.util.HashMap;
import java.util.Map;

public class LongPressedLeetCode {

    public boolean isLongPressedName(String name, String typed) {
        int j = 0, i = 0;
        while (j < typed.length()) {
            if (i != name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }

        if (i == name.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        //"alexd"
        //"ale"
        String name = "alexd", typed = "ale";
        LongPressedLeetCode lp = new LongPressedLeetCode();
        System.out.println(lp.isLongPressedName(name, typed));
    }

}
