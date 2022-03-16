import java.util.Arrays;

public class DefensiveCopying {

        private final int[] values;

        public DefensiveCopying(final int size) {
            values = new int[size];
        }

        public int[] getValues() {
            return values;
        }

        public void setValue(final int index, final int value) throws IllegalArgumentException {
            if (value < 0) {
                throw new IllegalArgumentException("The value must be positive");
            }

            values[index] = value;
        }

        @Override
        public String toString() {
            return Arrays.toString(values);
        }
    }
