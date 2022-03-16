/**
 * public String gcdOfStrings(String str1, String str2) {
 *
 *             if (str1.length() < str2.length()) {
 *                 return gcdOfStrings(str2, str1);
 *             }
 *             else if (!str1.startsWith(str2)) {
 *                 return "";
 *             }
 *             else if (str2.isEmpty()) {
 *                 return str1;
 *             }
 *             else {
 *                 System.out.println("str1.substring(str2.length() : " +str1.substring(str2.length()));
 *                 System.out.println("str2 : " +str2);
 *                 return gcdOfStrings(str1.substring(str2.length()), str2);
 *             }
 *     }
 */




class GcdOfStrings_tobeFixed {
    //https://leetcode.com/problems/greatest-common-divisor-of-strings/
    public String gcdOfStrings(String str1, String str2) {

        String compareString = str1;
        if (str1.length() > str2.length()) {
            compareString = str2;
        }
        String divisorString = "";

        for (int i = 0; i < compareString.length(); i++) {
            if (compareString.charAt(i) == str1.charAt(i) && compareString.charAt(i) == str2.charAt(i)) {
                divisorString = divisorString.concat(String.valueOf(compareString.charAt(i)));
            }
        }
        str1 = str1.replace(divisorString, "");
        str2 = str2.replace(divisorString, "");

        if(divisorString.length() > 1 && str1.length() == 0 && str2.length() == 0 ) {
            return divisorString;
        }
        return "";


    }

    public static void main(String[] args) {
        GcdOfStrings_tobeFixed sol = new GcdOfStrings_tobeFixed();
        /*
        "TAUXX TAUXX TAUXX TAUXX TAUXX"
        "TAUXX TAUXX TAUXX TAUXX TAUXX TAUXX TAUXX TAUXX TAUXX"

        TAUXX

        "ABABAB"
        "ABAB"
         */
        //System.out.println(sol.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX" , "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        //System.out.println(sol.gcdOfStrings("ABCABC" , "ABC"));
        System.out.println(sol.gcdOfStrings("ABABAB" , "ABAB"));
    }
}