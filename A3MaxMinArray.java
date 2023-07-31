 
public class A3MaxMinArray {

    public static void main(String[] args) {
    
        int[] arr = new int[] {1, 2, 3, 4, 5};

        int max = arr[0];
        int min = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
    }
}
