import java.util.Arrays;

public class ReverseOnlyTheStringInParentheses {
    String reverseInParentheses(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
//        int startingIndex = 0;
//        int endingIndex = 0;
//        String newInputString = "";
//        int len = inputString.length();
//        for(int i = 0 ; i < len; i++ ) {
//            if(inputString.charAt(i) == '(') {
//                startingIndex = i + 1;
//                while (inputString.charAt(i) != ')') {
//                    i++;
//                    continue;
//                }
//                endingIndex = i;
//                StringBuilder sb=new StringBuilder(inputString.substring(startingIndex, endingIndex));
//                sb.reverse();
//                newInputString = inputString.substring(0,startingIndex-1).concat(sb.toString()).concat(inputString.substring(endingIndex+1,len));
//                inputString = new String(newInputString);
//                len = inputString.length();
//                i = i - 1;
//            }
//        }
//
//        return newInputString;
    }
    public static void main(String[] args) {

        String inputString = "foo(bar(baz))blim";

        ReverseOnlyTheStringInParentheses p = new ReverseOnlyTheStringInParentheses();
        System.out.println(p.reverseInParentheses(inputString));
    }
}
