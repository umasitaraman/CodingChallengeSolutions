public class reverseDigits {
// int reversed = 0;
    // while (n > 0) {
    //     int lastDigit = n % 10;
    //     n = n / 10;
    //     reversed = (reversed * 10) + lastDigit;
    // }

    // return reversed;
    int solution(int n) {
        String nString = String.valueOf(n);
        String reversed = new StringBuilder(nString).reverse().toString();
        return Integer.parseInt(reversed);
    }

}
