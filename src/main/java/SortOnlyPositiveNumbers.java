import java.util.Arrays;

public class SortOnlyPositiveNumbers {
    int[] sortByHeight(int[] a) {
        System.out.println(a.length);

        for (int i=0; i<a.length; i++) {
            for (int j = 0; j<a.length - 1; j++) {
                int temp = a[j];
                if (temp >= 0) {
                    int k = j+1;
                    while(a[k] < 0 && k < a.length - 1)
                        k++;
                    if (a[j] > a[k] && a[k] >= 0) {
                        a[j] = a[k];
                        a[k] = temp;
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {

        int[] a = {44, 36, 35, 78, 70, 92, 60, 17, 67, -1, 91, -1, 69, 54, 88, 58, 9, 90, 9, 12, 66, 21, 79, 99, -1, 18, 46, 78, 38, 15, 26, 82, -1, 65, -1, 44, 51, 3, 37, 60, -1, 59, -1, -1, 78, 97, 9, 90, 24, 75, 45, 65, 24, 87, 44, 100, 94, 98, -1, 97, 72, 50, -1, 50, 39, 70, 91, 25, 66, 79, 69, 46, 20, 99, 57, 34, 42, 84, 8, -1, 95, 5, 59, 98, 97, 36, 89, 4, -1, 29, 9, 97, 55, 30, 16, -1, -1, -1, 10, -1};
        SortOnlyPositiveNumbers p = new SortOnlyPositiveNumbers();
        System.out.println(Arrays.toString(p.sortByHeight(a)));
    }

}
