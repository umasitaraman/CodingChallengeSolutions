class MinimumNumberOfSwapsRequired {
    public int minSwaps(String s) {
        int length = s.length();
        int extraClose = 0;
        int max = 0;
        int minSwapCount = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ']') {
                extraClose += 1;
                if (extraClose > max) {
                    max = extraClose;
                }
            } else if (s.charAt(i) == '[') {
                extraClose -= 1;
            }
        }
        if (max % 2 == 0) {
            minSwapCount = max / 2;
        } else {
            minSwapCount = (max + 1)/ 2;
        }
        return minSwapCount;
    }

    public static void main(String[] args) {
        MinimumNumberOfSwapsRequired sol = new MinimumNumberOfSwapsRequired();
        String s = "[]";
        System.out.println(sol.minSwaps(s));
    }
}