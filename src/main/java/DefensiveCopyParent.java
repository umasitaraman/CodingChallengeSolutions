/**
 * The program retrieves the array of integers using the getValues() method.
 * This method returns a reference to the same array (object instance) that the instance of Data has.
 * Therefore, any changes to the returned array will affect the same array contained within the
 * instance of the Data class. In other words, instead of using the setValue() method,
 * and pass through the proper channels, we can modify the array's content directly.
 *
 * Let us understand well what is happening here.
 *
 * A new instance of the Data class is created. This instance can be accessed through the variable data.
 *
 * When an instance of the Data class is created, an array of integers is created too.
 *                  The array, which is an object in Java, can be accessed through the values field within the Data class.
 *
 * The getValues() methods returns a reference (or a pointer) to the same object that the field values is referring to.
 *
 * The integer array object has now escaped the object of type Data.
 *
 * Defensive copying is a technique where an identical, but disconnected, copy of an object (including arrays) is
 * returned instead of the original one (similar to a deep copy - Wiki). Thus any modification to the returned
 * object will not affect the original object.
 *Instead of returning a reference to the object referred to by the field named values, we return a copy instead as shown in the following example.
 *
 *  import java.util.Arrays;
 *
 *   public class Data {
 *
 *      public int[] getValues() {
 *          return Arrays.copyOf(values, values.length);
 *      }
 *  }
 *  The Arrays (Java Doc) class provides a simple way to create a copy of an array which is independent from the original array.
 *
 * If instead of arrays, we store the values into a List (Java Doc), then we can return an immutable copy of the list.
 * In other words, we will have two lists. One that can be modified, and another one that cannot,
 * and both lists are backed by the same data. The set method will operate on the modifiable one,
 * while the get method will return the unmodifiable one. This approach will save us from creating
 * a new array every time the getValues() method is invoked
 * The inner class UnmodifiableList (Java Doc) will throw an UnsupportedOperationException when any of the
 * mutable methods, such as add() or set() are invoked. This guarantees that the recipient code will not modify
 * the list while it shares any modifications made as shown next.
 *
 * Defensive copying helps encapsulation as it mitigates escape of fields through the getters methods.
 * Defensive copying creates a copy every time and thus you can end up with too many copying of something.
 * This can strain the memory management (the garbage collector) and can have a negative effects on the
 * whole application performance. With that said, it is quite effective and simple to implement.
 *
 */
import java.util.List;

public class DefensiveCopyParent {
    public static void main(final String[] args) {

        /* This will fail as you cannot set negative numbers
         *final DefensiveCopying data = new DefensiveCopying(10);
            data.setValue(0, 5);
            data.setValue(0, -10);
         */

        //final DefensiveCopying data = new DefensiveCopying(10);
        //final DefensiveCopyImplementation data = new DefensiveCopyImplementation(10);
        final DefensiveCopyWithArrayList data = new DefensiveCopyWithArrayList();
//        data.setValue(0, 5);
//
//        final int[] values = data.getValues();
//        values[0] = -10;

        //Code to validate Defensive Copy through ArrayList

        data.addValue(5);

        final List<Integer> values = data.getValues();
        values.set(0, -10);

        System.out.println(data);
    }
}
