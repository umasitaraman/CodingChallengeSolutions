import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

//        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> resultMap = new HashMap<>();
        for (String str : strs) {
            String sortedKey = sortString(str);
            if(resultMap.containsKey(sortedKey)) {
                resultMap.get(sortedKey).add(str);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                resultMap.put(sortedKey, anagrams);
            }
        }

//       for(Map.Entry<String, List<String>> entry : resultMap.entrySet()) {
//           result.add(entry.getValue());
//       }

        return new ArrayList<>(resultMap.values());
//        return result;
    }

    private static String sortString(String str) {
        char[] strChar = str.toCharArray();
        Arrays.sort(strChar);
        return new String(strChar);
    }

    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }



}



