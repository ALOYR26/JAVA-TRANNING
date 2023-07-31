import java.util.Scanner;

public class A2insertElearray {

    public static void main(String[] args) {
        int[] arr = new int[];
        arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;arr[4]=5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to be inserted: ");
        int ele = sc.nextInt();

        System.out.println("Enter the position where the element is to be inserted: ");
        int pos = sc.nextInt();
        
        for (int i = arr.length - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = ele;

        // Print the array.
        System.out.println("The array after inserting the element is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}