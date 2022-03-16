import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefensiveCopyWithArrayList {

    private final List<Integer> values = new ArrayList<>();
    private final List<Integer> immutableValues = Collections.unmodifiableList(values);

    public List<Integer> getValues() {
        return immutableValues;
    }

    public void addValue(final int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("The value must be positive");
        }

        values.add(value);
    }

    @Override
    public String toString() {
        return String.valueOf(values);
    }
}


