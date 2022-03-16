/**
 * Given an array of positive integers a, your task is to calculate the sum of every possible a[i] ∘ a[j], where
 * a[i] ∘ a[j] is the concatenation of the string representations of a[i] and a[j] respectively.
 */

public class ConcatenationSum {

    private int oldestIndex = 0;
    private int size = 0;
    private String[] elements = {"Pokemon", "BubbleGuppies","Raya"};

    public String add(String mostRecentlyUsed) {
        int newIndex;
        if (size < elements.length) {
            newIndex = (oldestIndex + size) % elements.length;
            size++;
        } else {
            newIndex = oldestIndex;
            oldestIndex = (oldestIndex + 1) % elements.length;
        }

        String overwrittenElement = elements[newIndex];
        elements[newIndex] = mostRecentlyUsed;
        return overwrittenElement;
    }

    public static void main(String[] args) {
        ConcatenationSum S = new ConcatenationSum();
        System.out.println(S.add("Moana"));
    }
}



