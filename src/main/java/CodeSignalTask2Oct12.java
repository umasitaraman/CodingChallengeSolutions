import java.util.Arrays;

public class CodeSignalTask2Oct12 {

    /**
     * a < b > c or a > b < c.
     * your task is to construct an array of length numbers.length - 2,
     * where the ith element of the output array equals 1 if the triple
     * (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.
     */
    int[] isZigzag(int[] numbers) {
        int [] retArray = new int[numbers.length - 2];
        for (int i = 0; i <= numbers.length - 3; i++) {
            if ((numbers[i] == numbers[i+1]) && (numbers[i+1] == numbers[i+2])) {
                continue;

            } else if (((numbers[i] < numbers[i+1]) && (numbers[i+1] > numbers[i+2])) || ((numbers[i] > numbers[i+1]) && (numbers[i+1] < numbers[i+2]))) {
                System.out.println(numbers[i]);
                System.out.println(numbers[i+1]);
                System.out.println(numbers[i+2]);
                System.out.println(numbers[i] < numbers[i+1]);
                System.out.println(numbers[i+1] > numbers[i+2]);

                retArray[i] = 1;
            }
            else {
                System.out.println("==========");
                System.out.println(numbers[i]);
                System.out.println(numbers[i+1]);
                System.out.println(numbers[i+2]);
                System.out.println(numbers[i] < numbers[i+1]);
                System.out.println(numbers[i+1] > numbers[i+2]);
                retArray[i] = 0;
            }
        }
        return retArray;
    }


    public static void main(String[] args) {
        CodeSignalTask2Oct12 p = new CodeSignalTask2Oct12();
        int [] numbers ={11, 14, 3, 17, 16, 13, 3, 7, 19, 8};
        int [] result = p.isZigzag(numbers);
        System.out.println(Arrays.toString(result));

    }
}
