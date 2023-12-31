package codesignaltasks;

public class MatrixElementsSum {
    public static void main(String[] arg){
        int[][] matrix={
                {0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}
        };
        System.out.println(solution(matrix));
    }
    static int solution(int[][] matrix) {
        int cost = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 0) {
                    break;
                }
                cost += matrix[j][i];
            }
        }
        return cost;
    }
}
