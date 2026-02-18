package Arrays;

public class Matrix_Zero {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };

        setZeroes(matrix);

        // print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRow = new boolean[rows];
        boolean[] zeroCol = new boolean[cols];

        // find zero positions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // set zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRow[i] || zeroCol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
