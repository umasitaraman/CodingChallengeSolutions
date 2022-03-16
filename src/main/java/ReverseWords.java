public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder newString = new StringBuilder();
        String[] splitString = s.split(" ");
        for (String word : splitString) {
            StringBuilder str = new StringBuilder(word);
            str.reverse();
            newString.append(str).append(" ");
        }
        return newString.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        ReverseWords r =  new ReverseWords();
        System.out.println(r.reverseWords(s));
    }
}
