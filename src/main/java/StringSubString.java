public class StringSubString {
    String chars;

    StringSubString(String chars) {
        this.chars = chars;
    }

    public String revString() {
        char[] c = chars.toCharArray();
        int len = chars.length();
        String revString1 = "";
        for(int i = len - 1; i >= 0; i-- ) {
            revString1 = revString1.concat(String.valueOf(c[i]));
        }
        return revString1;
    }

    public CharSequence partString(int start, int end) {
        char[] c = chars.toCharArray();
        int len = chars.length();
        String revString2 = revString();
        for(int i = len - 1; i >= 0; i-- ) {
            revString2 = revString2.concat(String.valueOf(c[i]));
        }
        return revString2.substring(start, end);
    }

    public static void main(String[] args) {
        String chars = "amazon";
        StringSubString newString = new StringSubString(chars);
        System.out.println("SubString : " + newString.partString(0,3));
        System.out.println("Reverse String : " + newString.revString());
    }

}