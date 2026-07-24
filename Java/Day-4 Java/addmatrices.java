/*Program to add 2 matrices of size 2x3*/
public class addmatrices {
    public static void main(String[] args) {
        int[][] matrix1 = {{12, 23, 34},
                {32, 39, 87}
        };
        int[][] matrix2 = {
                {45, 47, 48},
                {23, 12, 19}
        };
        int[][] result = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
