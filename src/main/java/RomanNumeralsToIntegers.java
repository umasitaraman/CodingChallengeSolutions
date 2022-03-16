import java.util.HashMap;
import java.util.Map;
public class RomanNumeralsToIntegers {

        public static int romanToInteger(String s)
        {
            Map<Character,Integer> numbersMap = new HashMap<>();
            numbersMap.put('I',1);
            numbersMap.put('V',5);
            numbersMap.put('X',10);
            numbersMap.put('L',50);
            numbersMap.put('C',100);
            numbersMap.put('D',500);
            numbersMap.put('M',1000);

            int result = numbersMap.get(s.charAt(s.length() - 1));

            for (int i = s.length() - 2; i >= 0; i--) {
                if (numbersMap.get(s.charAt(i)) < numbersMap.get(s.charAt(i + 1))) {
                    result = result - numbersMap.get(s.charAt(i));
                } else {
                    result = result + numbersMap.get(s.charAt(i));
                }
            }
            return result;
        }

        public static void main(String args[])
        {
            // we take input as a String
            String romanNumber="IV";
            int result = romanToInteger(romanNumber);

            System.out.println("The Roman Number is: "+romanNumber);
            System.out.println("Its Integer Value is: "+result);
        }

    }