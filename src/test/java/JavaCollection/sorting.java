import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sorting {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 2));
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3]
        int i = Collections.binarySearch(numbers, 1);
        System.out.println(i);
    }
}
