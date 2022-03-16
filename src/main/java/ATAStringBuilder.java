import java.util.ArrayList;
import java.util.List;


public class ATAStringBuilder {

    private List<Character> value = new ArrayList<>();

    public ATAStringBuilder(String initialString) {
        System.out.println("initialString :" + initialString);
        for(int i = 0; i < initialString.length(); i++) {
            value.add(initialString.charAt(i));
        }
    }

    public static void main(String[] args) {
        ATAStringBuilder a =  new ATAStringBuilder("amg");
        String result = a.insert(2, "azin").toString();
        //System.out.println(result);
    }

    public ATAStringBuilder insert(int offset, String str) {
        //char [] strarr = str.toCharArray();
        for (int i = 0; i < str.length() ; i++) {
            value.add(offset + i, str.charAt(i));
        }
        System.out.println(value);
        return this;
    }
}