import java.util.ArrayList;
import java.util.List;

class ReverseVowelsInAString {
    public String reverseVowels(String s) {
        List<Integer> indexArray = new ArrayList<>();
        char[] ch = s.toLowerCase().toCharArray();
        for (int i = 0, k = 0; i < ch.length; i ++, k++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                indexArray.add(i);
                k++;
            }
        }
        for (int i = 0; i < indexArray.size() / 2; i++) {
            char charAtFirstIndex = s.charAt(indexArray.get(i));
            char swapChar = s.charAt(indexArray.get(indexArray.size() - 1 - i));
            if (indexArray.get(indexArray.size() - 1 - i) != s.length() - 1) {
                s = s.substring(0, indexArray.get(i)) + swapChar +
                        s.substring(indexArray.get(i) + 1, indexArray.get(indexArray.size() - 1 - i)) + charAtFirstIndex +
                        s.substring(indexArray.get(indexArray.size() - 1 - i) + 1, s.length());
            } else {
                s = s.substring(0, indexArray.get(i)) + swapChar +
                        s.substring(indexArray.get(i) + 1, indexArray.get(indexArray.size() - 1 - i)) + charAtFirstIndex;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        ReverseVowelsInAString s = new ReverseVowelsInAString();
        System.out.println(s.reverseVowels("aA"));
    }
}