public class ReverseCharArray {
    public void reverseString(char[] s) {
        int n = s.length;
        char tmp;
        for (int i = 0; i < n/2; i++) {
            tmp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = tmp;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        ReverseCharArray r = new ReverseCharArray();
        char[] array = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        r.reverseString(array);
    }
}
