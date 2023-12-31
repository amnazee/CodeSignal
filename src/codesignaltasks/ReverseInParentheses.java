package codesignaltasks;

import java.util.Arrays;
public class ReverseInParentheses {
    public static void main(String[] arg){
        String input="(bar)";
        System.out.println(solution(input));
    }
    static String solution(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
    }
}