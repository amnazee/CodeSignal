package codesignaltasks;

import java.util.Arrays;

public class SortbyHeight {
    public static void main(String[] arg){
        int[] array={-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(array)));
    }
    static int[] solution(int[] a) {
        //temporary variable
        int t;
        //for loop iteration through the entire array
              for (int i = 0; i < a.length; i++)
        //nested for to compare two elements in the array
                for (int j = i + 1; j < a.length; j++)
                //the condition checks if the first element is greater than the second element and both of them are not -1
                   if (a[i] > a[j] && a[i] != -1 && a[j] != -1) {
                      //puts that in t
                      t = a[i];
                      //then swapping both the elements
                      a[i] = a[j];
                      a[j] = t;
                   }
        //return the sorted array where it is according to the height
        return a;
    }
}