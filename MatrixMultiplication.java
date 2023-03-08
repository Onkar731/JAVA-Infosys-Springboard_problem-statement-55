public class MatrixMultiplication {
    public static int[][] matrixProduct(int n,int [][]matrix1, int [][]matrix2) {
        int [][]product = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                product[i][j] = 0;

                for(int k = 0; k < n; k++) {
                    product[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        // returning product matrix
        return product;
    }
}
