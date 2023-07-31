
import java.util.*;

public class A7AddMatrices {

    public static void main(String[] args) {
        int[][] m1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m2 = new int[][]{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        int[][] res = new int[m1.length][m1[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("The result matrix is: ");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}