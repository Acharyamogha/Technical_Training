public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int m1 = matrixA.length;
        int n1 = matrixA[0].length;
        int m2 = matrixB.length;
        int n2 = matrixB[0].length;

        if (n1 != m2) {
            return null; // Matrix multiplication not possible
        }

        int[][] result = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};
        int[][] result = multiplyMatrices(matrixA, matrixB);
        if (result != null) {
            for (int[] row : result) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication not possible.");
        }
    }
}
