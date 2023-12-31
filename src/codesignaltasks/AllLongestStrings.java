package codesignaltasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {
    public static void main(String[] arg){
       String[] array={"aba", "aa", "ad", "vcd", "aba"};
        System.out.println(Arrays.toString(solution(array)));
    }
    static String[] solution(String[] inputArray) {
        //we have an array
        //we create another empty array
        //calculate the length of string in the array
        //store it in another array
        //return the new array
        int[] arrayLength = new int[inputArray.length];
        List<String> list = new ArrayList<>();
        for(int i = 0; i < inputArray.length; i++ ){
            arrayLength[i] = inputArray[i].length();
        }
        Arrays.sort(arrayLength);
        int maxLength = arrayLength[arrayLength.length-1];
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i].length() == maxLength){
                list.add(inputArray[i]);
            }
        }
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }
}
