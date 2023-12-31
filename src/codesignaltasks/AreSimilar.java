package codesignaltasks;

public class AreSimilar {
    public static void main(String[] arg){
        int[] a={1, 2, 3},b={1, 2, 3};
        System.out.println(solution(a,b));
    }
    static boolean solution(int[] a, int[] b) {
        //first checking the length of both the arrays if they are equal
        if (a.length != b.length) {
            return false;
        }
        //variable to count different elements
        int diffCount = 0;
        //Arrays to store differing elements and their indices
        int[] differingElementsA = new int[2];
        int[] differingElementsB = new int[2];
        //Loop through the arrays to find differing elements
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (diffCount == 2) {
                    return false;
                }
                // Store differing elements and their indices
                differingElementsA[diffCount] = a[i];
                differingElementsB[diffCount] = b[i];
                diffCount++;
            }
        }
        //If there are no differing elements, the arrays are similar
        if (diffCount == 0) {
            return true;
        }
        //If there are exactly two differing elements, check if they can be swapped
        if (diffCount == 2) {
            return differingElementsA[0] == differingElementsB[1] &&
                    differingElementsA[1] == differingElementsB[0];
        }
        // Arrays are not similar for other cases
        return false;
    }
}
