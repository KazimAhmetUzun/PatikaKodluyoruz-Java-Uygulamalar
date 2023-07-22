public class Transpose {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {2, 3, 4},
            {5, 6, 4}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Matris 1:");
        printMatrix(matrix1);
        System.out.println("Transpoze 1:");
        int[][] transposedMatrix1 = transposeMatrix(matrix1);
        printMatrix(transposedMatrix1);

        System.out.println("Matris 2:");
        printMatrix(matrix2);
        System.out.println("Transpoze 2:");
        int[][] transposedMatrix2 = transposeMatrix(matrix2);
        printMatrix(transposedMatrix2);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
