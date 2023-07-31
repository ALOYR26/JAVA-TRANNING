import java.util.*;

public class A8TransposeMatrix {

    public static void main(String[] args) {
        int[][] m = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] mt = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                mt[j][i] = m[i][j];
            }
        }

        System.out.println("The transpose matrix is: ");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[0].length; j++) {
                System.out.print(mt[i][j] + " ");
            }
            System.out.println();
        }
    }
}