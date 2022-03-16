import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllLongestStrings {


    String[] allLongestStrings(String[] inputArray) {

        ArrayList<String> retArray = new ArrayList<String>();
        int maxLength = 0;

        for (int i = 0; i < inputArray.length; i ++ ) {
            if (inputArray[i].length() >= maxLength ) {
                maxLength = inputArray[i].length();
            }
        }
        for (int i = 0; i < inputArray.length; i ++ ) {
            if (inputArray[i].length() == maxLength) {
                retArray.add(inputArray[i]);
            }
        }

        String[] newRetArray = retArray.toArray(new String[retArray.size()]);
        System.out.println(Arrays.toString(newRetArray));
        return newRetArray;
    }

    public static void main(String[] args) {

        String [] inputArray = {"abc", "eeee", "abcd", "dcd"};
        PrintAllLongestStrings p = new PrintAllLongestStrings();
        p.allLongestStrings(inputArray);
    }
}
