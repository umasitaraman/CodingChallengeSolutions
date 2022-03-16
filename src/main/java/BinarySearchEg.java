import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class BinarySearchEg {
    public HashMap<Integer, Integer> binarySearch(int[] arr, int num) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int m =0;
        int count = 0;
        HashMap<Integer, Integer> result = new HashMap<>();

        while (l <= r) {
            m = l + (r -l) / 2;
            if(arr[m] == num) {
                count++;
                for (int i = 0; i < m; i ++) {
                    if (arr[i] == num) {
                        count++;
                    } else break;
                }
                for (int i = m; i < n; i ++) {
                    if (arr[i] == num) {
                        count++;
                    } else break;
                }
                return result; //new HashMap<>(arr[m], count);
            } else if (arr[m] < num) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return result;//new HashMap<>(arr[m], count);
    }
    public static void main(String args[]) {
        int arr[] = {10, 25, 34, 45, 57, 63, 63, 63, 63, 63, 66, 75 , 89, 92 };
        BinarySearchEg b = new BinarySearchEg();
        System.out.println(b.binarySearch(arr, 63));
    }
}

///**
// * Uses binary search to find the index of the targetValue in
// * the sorted array, arr. recursive method
// */
//int binarySearch(int arr[], int start, int end, int targetValue) {
//    if (start <= end) {
//        int middle = start + (end - start)/2;
//
//        if (arr[middle] == targetValue) {
//            return middle;
//        }
//        if (arr[middle] > targetValue) {
//            // we know it’s not at middle, so end can be one lower
//            return binarySearch(arr, start, middle - 1, targetValue);
//        }
//        // we know it’s not at middle, so start can be one higher
//        return binarySearch(arr, middle + 1, end, targetValue);
//    }
//    return -1;
//}
//