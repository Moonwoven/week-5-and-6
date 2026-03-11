public class FindMatrixSize {

    public static void main(String[] args) {

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Rows = " + rows);
        System.out.println("Columns = " + cols);

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}