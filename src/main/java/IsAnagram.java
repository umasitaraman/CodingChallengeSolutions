class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        if(s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsAnagram a = new IsAnagram();
        System.out.println(a.isAnagram("rat", "car"));
    }
}