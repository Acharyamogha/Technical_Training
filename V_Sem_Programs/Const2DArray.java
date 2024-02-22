import java.util.Arrays;

public class Const2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] constructedArray = construct2DArray(original, m, n);
        for (int[] row : constructedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
