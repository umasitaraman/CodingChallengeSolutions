import java.util.Arrays;
import java.util.Random;

public class MergeSortEg {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }
        System.out.println("Before Merge Sort : ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After Merge Sort : ");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        int mid = inputLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputLength - mid];

        if(inputLength < 2) {
            return;
        }

        for (int i = 0 ; i < mid; i++) {
            leftArray[i] = inputArray[i];
        }

        for (int i = mid ; i < inputLength; i++) {
            rightArray[i - mid] = inputArray[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(inputArray, leftArray, rightArray);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }


    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
