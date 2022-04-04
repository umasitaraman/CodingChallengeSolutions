import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordPatternMatcher {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> patterMatcher = new HashMap<>();
        String strArray[] = s.split(" ");

        if(pattern.length() != strArray.length) {
            return false;
        }

        for(int i = 0; i < pattern.length(); i++) {

            /**
             * Alternate implementation but has more runtime.
             */
//            if(patterMatcher.containsValue(strArray[i])) {
//                String value = strArray[i];
//
//                Set<String> keyChar = patterMatcher
//                        .entrySet()
//                        .stream()
//                        .filter(entry -> Objects.equals(entry.getValue(), value))
//                        .map(Map.Entry::getKey)
//                        .collect(Collectors.toSet());
//
//                for (String keyValue : keyChar) {
//                    if(!keyValue.equals(String.valueOf(pattern.charAt(i)))) {
//                        return false;
//                    }
//                }
//            }
             if (patterMatcher.containsKey(pattern.charAt(i))) {

                if (!strArray[i].equals(patterMatcher.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                 if (patterMatcher.containsValue(strArray[i])) {
                     return false;
                 }
                patterMatcher.put(pattern.charAt(i), strArray[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //pattern = "abba", s = "dog cat cat fish"
        //pattern = "aaaa", s = "dog cat cat dog"
        //pattern = "aaaa", s = "cat cat cat cat"
        //"abba"
        //"dog dog dog dog"
        String pattern = "abba", s = "dog cat cat fish";
        WordPatternMatcher wpm = new WordPatternMatcher();
        System.out.println(wpm.wordPattern(pattern, s));
    }
}


