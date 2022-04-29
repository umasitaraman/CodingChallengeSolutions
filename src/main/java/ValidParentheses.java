import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack parentheses = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('  ||
                s.charAt(i) == '{' ||
                s.charAt(i) == '[') {
                parentheses.push(s.charAt(i));
            }
            if(s.charAt(i) == ')') {
                if(parentheses.isEmpty() || !parentheses.peek().equals('(')) {
                    return false;
                }
                parentheses.pop();
            }

            if(s.charAt(i) == '}') {
                if(parentheses.isEmpty() || !parentheses.peek().equals('{')) {
                    return false;
                }
                parentheses.pop();
            }

            if(s.charAt(i) == ']') {
                if(parentheses.isEmpty() || !parentheses.peek().equals('[')) {
                    return false;
                }
                parentheses.pop();
            }
        }
        if(!parentheses.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()"));
    }


}
