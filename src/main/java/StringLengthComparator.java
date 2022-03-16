import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthComparator implements Comparator<String> {

    public static void main(String[] args) {
        List<String> sampleStrings = new ArrayList<>();
        sampleStrings.add("aa");
        sampleStrings.add("bbbbbbbbb");
        sampleStrings.add("z");

        Comparator<String> stringComparator = new StringLengthComparator();
        Collections.sort(sampleStrings, stringComparator);
}

        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }

}
