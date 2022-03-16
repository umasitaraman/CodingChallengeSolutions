import java.math.BigInteger;
import java.util.Stack;

class RemoveKDigitsUsingStack {
    public String removeKdigits(String num, int k) {
        int length = num.length();
        Stack<Character> myStack = new Stack<>();
        for (int j = 0; j < length; j++) {
            while (!myStack.isEmpty() && k > 0 && myStack.peek() > num.charAt(j)) {
                myStack.pop();
                k-=1;
            }
            if(!myStack.isEmpty() || num.charAt(j) != '0') {
                myStack.push(num.charAt(j));
                System.out.println("Inside loop : " + num.charAt(j));
                System.out.println("myStack : " + myStack);
            }
        }
        while(!myStack.isEmpty() && k != 0) {
            myStack.pop();
            k-=1;
        }
        if (myStack.isEmpty()) return String.valueOf(0);

        num = myStack.toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(", ", "");
        BigInteger number = new BigInteger(num);
        return String.valueOf(number);
    }
    public static void main(String[] args) {
        String num = "200134";
        int k = 3;
        RemoveKDigitsUsingStack sol = new RemoveKDigitsUsingStack();
        System.out.println(sol.removeKdigits(num, k));
    }
}