import java.util.*;

public class A5RemoveDuplicatesFromArray {

    public static void main(String[] args) {
      
        int[] arr = new int[] {1, 2, 3, 3, 4, 5, 5, 6};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (Integer element : set) {
            uniqueArr[i++] = element;
        }
        System.out.println("The unique array is: ");
        for (int j = 0; j < uniqueArr.length; j++) {
            System.out.print(uniqueArr[j] + " ");
        }
    }
}