package Arrays;

import java.util.Arrays;

public class two_d {
    public static void main(String[] args) {
        int[][] matrix_1 = {{1,2},{3,4},{5,6}};
        int[][] matrix_2 = {{11,22},{33,44},{55,66}};
        int[][] solution = new int[2][3];
        for (int i = 0; i < matrix_1.length-1; i++) {
            for (int j = 0; j < matrix_1.length-1; j++) {
                solution[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
        for (int i = 0; i < solution.length; i++) {
            System.out.print(Arrays.toString(solution[i]));
        }
    }
}
