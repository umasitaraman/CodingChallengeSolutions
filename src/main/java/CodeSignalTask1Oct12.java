//Oct-12-2021
/**
 * Let's say a triple (a, b, c) is a zigzag if either a < b > c or a > b < c.
 *
 * Given an array of integers numbers, your task is to check all the triples of its consecutive elements for being a zigzag. More formally, your task is to construct an array of length numbers.length - 2, where the ith element of the output array equals 1 if the triple (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.
 *
 * Example
 *
 * For numbers = [1, 2, 1, 3, 4], the output should be isZigzag(numbers) = [1, 1, 0].
 *
 * (numbers[0], numbers[1], numbers[2]) = (1, 2, 1) is a zigzag, because 1 < 2 > 1;
 * (numbers[1], numbers[2] , numbers[3]) = (2, 1, 3) is a zigzag, because 2 > 1 < 3;
 * (numbers[2], numbers[3] , numbers[4]) = (1, 3, 4) is not a zigzag, because 1 < 3 < 4;
 * For numbers = [1, 2, 3, 4], the output should be isZigzag(numbers) = [0, 0];
 *
 * Since all the elements of numbers are increasing, there are no zigzags.
 *
 * For numbers = [1000000000, 1000000000, 1000000000], the output should be isZigzag(numbers) = [0].
 *
 * Since all the elements of numbers are the same, there are no zigzags.
 *
 * Input/Output
 *
 * [execution time limit] 3 seconds (java)
 *
 * [input] array.integer numbers
 *
 * An array of integers.
 *
 * Guaranteed constraints:
 * 3 ≤ numbers.length ≤ 100,
 * 1 ≤ numbers[i] ≤ 109.
 *
 * [output] array.integer
 *
 * Return an array, where the ith element equals 1 if the triple (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.
 */


public class CodeSignalTask1Oct12 {
    boolean eraseOneDigit(String firstnum, String secondnum, String thirdnum) {
        if (Integer.parseInt(firstnum) + Integer.parseInt(secondnum) == Integer.parseInt(thirdnum)) {
            return true;
        } else {
            for (int i = 0; i < firstnum.length(); i++) {
                String newFirstNum = firstnum.substring(0, i).concat(firstnum.substring(i + 1, firstnum.length()));
                if (newFirstNum.length() == 1 && (Integer.parseInt(newFirstNum) + Integer.parseInt(secondnum) == Integer.parseInt(thirdnum))) {
                    return true;
                }
                else if ((newFirstNum.charAt(0) != '0') && (Integer.parseInt(newFirstNum) + Integer.parseInt(secondnum) == Integer.parseInt(thirdnum))) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        CodeSignalTask1Oct12 p = new CodeSignalTask1Oct12();
        String firstnum = "153";
        String secondnum = "153";
        String thirdnum = "306";
        System.out.println(p.eraseOneDigit(firstnum,secondnum,thirdnum));

    }


}
