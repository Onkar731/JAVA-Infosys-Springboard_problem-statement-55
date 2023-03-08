import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting input from the input string
        String []stringArray1 = inpuString.split("@");

        int n = Integer.parseInt(stringArray1[0]);

        String []stringArray2 = stringArray1[1].split("#");
        String []stringArray3 = stringArray1[2].split("#");

        int [][]matrix1 = new int[n][n];
        int [][]matrix2 = new int[n][n];

        for(int i = 0; i < n; i++) {
            matrix1[i] = Arrays.stream(stringArray2[i].split(",")).mapToInt(Integer::parseInt).toArray();
            matrix2[i] = Arrays.stream(stringArray3[i].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        // printing product matrix
        System.out.println(Arrays.deepToString(MatrixMultiplication.matrixProduct(n, matrix1, matrix2)));

        // closing resource
        sc.close();
    }
}