package codesignaltasks;

public class RearrangePalindrome {
    public static void main(String[] arg){
        String input="aabb";
        System.out.println(solution(input));
    }
    static boolean solution(String inputString) {

        int[] chars = new int[256];
        int oddCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            chars[c]++;
            if(chars[c]%2==1){
                oddCount+=1;
            }
            else{
                oddCount-=1;
            }
        }
        return oddCount <= 1;
    }
}
