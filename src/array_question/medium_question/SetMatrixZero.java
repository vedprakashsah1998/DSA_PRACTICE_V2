package array_question.medium_question;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1}, { 0}};
        System.out.println(Arrays.deepToString(setZeroMatrix1(matrix)));
    }

    private static int[][] setZeroMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
//                    for (int col = 0; col < n; col++) {
//                        if (matrix[i][col] != 0) {
//                            matrix[i][col] = -1;
//                        }
//                    }

                    markCol(matrix, i, n);

//                    for (int row = 0; row < m; row++) {
//                        if (matrix[row][j] != 0) {
//                            matrix[row][j] = -1;
//                        }
//                    }

                    markRow(matrix, j, m);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    private static void markRow(int[][] matrix, int j, int m) {
        for (int row = 0; row < m; row++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    private static void markCol(int[][] matrix, int i, int n) {
        for (int col = 0; col < n; col++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }


    private static int[][] zeroMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] col = new boolean[m];
        boolean[] row = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }




    private static int[][] setZeroMatrix1(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }


}
