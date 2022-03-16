import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class UniqueCharacters {
    public boolean uniqueCharacters(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
    public static void main(String args[]) {
        String str = "abcdeaghij";
        UniqueCharacters uc = new UniqueCharacters();
        System.out.println(uc.uniqueCharacters(str));
    }
}