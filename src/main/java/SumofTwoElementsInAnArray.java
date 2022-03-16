import java.util.Arrays;

public class SumofTwoElementsInAnArray {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] + numbers[i] == target && i != j) {
                    index[0] = i + 1;
                    index[1] = j + 1;
                    return index;
                }
            }
        }
        System.out.println(Arrays.toString(index));
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int target = 6;
        SumofTwoElementsInAnArray s = new SumofTwoElementsInAnArray();
        s.twoSum(arr, target);
    }
}
