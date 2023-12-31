package codesignaltasks;

public class CheckPalindrome {
    public static void main(String[] arg){
        String input="abba";
        System.out.println(solution(input));
    }
    static boolean solution(String inputString) {
        int left = 0, right = inputString.length() - 1;
        while(left < right)
        {
            if( inputString.charAt(left) !=  inputString.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
