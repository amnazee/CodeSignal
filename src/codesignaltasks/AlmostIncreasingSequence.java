package codesignaltasks;

public class AlmostIncreasingSequence {
    public static void main(String[] arg){
        int[] sequence={1, 3, 2, 1};
        System.out.println(solution(sequence));
    }
    static boolean solution(int[] sequence) {

        int removalCount = 0;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                removalCount++;
                if (removalCount > 1) {
                    return false; // More than one removal is needed, not possible to obtain increasing sequence
                }
                // Check if removing the current or previous element would result in an increasing sequence
                if (i < 2 || sequence[i] > sequence[i - 2]) {
                    sequence[i - 1] = sequence[i]; // Remove current element
                } else {
                    sequence[i] = sequence[i - 1]; // Remove previous element
                }
            }
        }
        return true;
    }

}
