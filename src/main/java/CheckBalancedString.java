public class CheckBalancedString {
    public int balancedStringSplit(String s) {
        int lrCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.toUpperCase().charAt(i) == 'R') {
                lrCount += -1;
            } else if (s.toUpperCase().charAt(i) == 'L') {
                lrCount += 1;
            }
            if (lrCount == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "LLLLRRRR";
        CheckBalancedString sol = new CheckBalancedString();
        System.out.println(sol.balancedStringSplit(s));
    }
}
