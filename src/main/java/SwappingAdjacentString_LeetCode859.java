import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SwappingAdjacentString_LeetCode859 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        } else if (s.equals(goal)){
            Set<Character> startString = new HashSet<>();
            for (char c : s.toCharArray()) {
                startString.add(c);
            }
            return startString.size() < s.length();
        }

        List<Integer> compareList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                compareList.add(i);
            }
        }
        if (compareList.size() == 2) {
            if (s.charAt(compareList.get(0)) == goal.charAt(compareList.get(1)) &&
                    (s.charAt(compareList.get(1)) == goal.charAt(compareList.get(0)))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SwappingAdjacentString_LeetCode859 sol = new SwappingAdjacentString_LeetCode859();
        System.out.println(sol.buddyStrings("ab", "ba"));
    }
}