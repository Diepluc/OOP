import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week11 {
    /**
     * generic.
     */
    public static <T extends Comparable> List<T> sortGeneric(List<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).compareTo(arr.get(j)) > 0) {
                    T num1 = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, num1);
                }
            }
        }
        return arr;
    }

}
