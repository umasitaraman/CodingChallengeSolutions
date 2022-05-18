//Avoid using built-in big integers to solve this challenge.
//Implement them yourself, since this is what you would be asked to do during a real interview.
//Given two binary strings a and b, add them together and return the resulting string.


public class BinaryStringAddition {
    String solution(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder str = new StringBuilder();
        int carry = 0;
        int sum = 0;
        while (i >= 0 || j >= 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            sum = digitA + digitB + carry;
            String c = String.valueOf(sum % 2);
            str.append(c);
            carry = sum / 2;
            i--;
            j--;
        }

        if (carry != 0) str.append("1");
        return str.reverse().toString();
    }
}
