package MatrixMultiply;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1},
                {2}
        };
        int[][] matrixB ={
                {10,20}
        };

        var resMatrix = App.MultiplyMatrix(matrixA,matrixB);
        System.out.println(Arrays.deepToString(resMatrix));
    }
}
