class CustomSortString {
    public String customSortString(String order, String s) {
        StringBuilder ans = new StringBuilder();
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : order.toCharArray()) {
            for (int i = 0; i < count[c - 'a']; i++) {
                ans.append(c);
            }
            count[c - 'a'] = 0;
        }

        for (char c = 'a'; c <= 'z' ; c++) {
            for (int i = 0; i < count[c - 'a']; i++) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}