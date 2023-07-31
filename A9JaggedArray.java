

import java.util.*;

public class A9JaggedArray {

    public static void main(String[] args) {
        int[][] jagarr = new int[][] {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for (int i = 0; i < jagarr.length; i++) {
            for (int j = 0; j < jagarr[i].length; j++) {
                System.out.print(jagarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


