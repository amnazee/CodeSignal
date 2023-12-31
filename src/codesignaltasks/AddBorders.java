package codesignaltasks;

import java.util.Arrays;

public class AddBorders {
    public static void main(String[] arg){
        String[] array={"abc", "ded"};
        System.out.println(Arrays.toString(solution(array)));
    }
    static String[] solution(String[] picture) {
        int rows = picture.length;
        int cols = picture[0].length();
        // Calculate the size of the new array
        int borderedRows = rows + 2;
        int borderedCols = cols + 2;
        // Create a new array with increased size
        String[] borderedArray = new String[borderedRows];
        // Add asterisks to the top and bottom borders, the repeat method adds the asterisks to the new array repeated bordercols number of times
        borderedArray[0] = "*".repeat(borderedCols);  // Top border
        borderedArray[borderedRows - 1] = "*".repeat(borderedCols);  // Bottom border
        // Add asterisks to the left and right borders, and copy the original matrix
        for (int i = 0; i < rows; i++) {
            borderedArray[i + 1] = "*" + picture[i] + "*";
        }
        return borderedArray;
    }
}
