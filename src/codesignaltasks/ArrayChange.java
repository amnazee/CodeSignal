package codesignaltasks;

public class ArrayChange {
    public static void main(String[] arg){
        int[] array = {1, 1, 1};
        System.out.println(solution(array)); // Output: 3
    }
    static int solution(int[] array) {
        int moves = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                int diff = array[i - 1] - array[i] + 1;
                moves += diff;
                array[i] += diff;
            }
        }
        return moves;
    }
}