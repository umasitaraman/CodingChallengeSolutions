class ShiftingCharsInAString {
    public boolean rotateString(String s, String goal) {
        String shiftedString = new String(s);
        for (int i = 0; i < s.length(); i++) {
            if (shiftedString.equalsIgnoreCase(goal)) {
                return true;
            } else {
                System.out.println("i : " + i);
                shiftedString = shiftChars(shiftedString);
                System.out.println("shiftedString : " + shiftedString);
            }
        }
        return false;
    }

    public String shiftChars(String srcString) {
        StringBuilder destString = new StringBuilder();
        for (int i = 1; i < srcString.length(); i++)  {
            destString.append(srcString.charAt(i));
        }
        destString.append(srcString.charAt(0));
        System.out.println("srcString : " + srcString);
        System.out.println("destString : " + destString);
        return destString.toString();
    }

    public static void main(String[] args) {
        ShiftingCharsInAString sol = new ShiftingCharsInAString();
        String start = "abcde";
        String goal = "cdeab";
        System.out.println(sol.rotateString(start, goal));
    }
}