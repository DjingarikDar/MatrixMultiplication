package MatrixMultiply;

public class App {
    public static int[][] MultiplyMatrix(int[][] matrixA, int[][] matrixB){
        var rotateMatrixB = columnToRow((matrixB));
        int indexRow = matrixA.length;
        int indexColumn = matrixB[0].length;
        int[][] resultMatrix = new int[indexRow][indexColumn];
        for (int i = 0; i < indexRow ; i++) {
            for (int j = 0; j < indexColumn; j++) {
                resultMatrix[i][j] = rowMultiply(matrixA[i],rotateMatrixB[j]);
            }
        }
        return resultMatrix;
    }
    public static int[][] columnToRow(int[][] matrix) {
        int indexRow = matrix[0].length;
        int indexColumn = matrix.length;
        int[][] newMatrix = new int[indexRow][indexColumn];
        for (int i = 0; i < indexRow ; i++) {
            for (int j = 0; j < indexColumn; j++) {
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }
    public static int rowMultiply(int[] rowA, int[] rowB) {
        int index = rowA.length;
        var result = 0;
        for (int i = 0; i < index; i++) {
            result += rowA[i]*rowB[i];
        }
        return result;
    }
}
