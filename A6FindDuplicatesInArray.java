import java.util.*;

public class A6FindDuplicatesInArray {

    public static void main(String[] args) {
.
        String[] arr = new String[] {"apple", "banana", "apple", "orange", "grape", "banana"};

        HashSet<String> set = new HashSet<>();

        for (String value : arr) {
            if (set.contains(value)) {
                System.out.println("Duplicate element: " + value);
            } else {
                set.add(value);
            }
        }
    }
}