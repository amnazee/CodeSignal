package codesignaltasks;

public class CommonCharacterCount {
    public static void main(String[] arg){
        String s1="aabcc", s2="adcaa";
        System.out.println(solution(s1,s2));
    }
    static int solution(String s1, String s2) {
        int[] charCount1 = new int[256]; // Assuming ASCII characters
        int commonCount = 0;
        // Count character frequencies in str1
        for (char ch : s1.toCharArray()) {
            charCount1[ch]++;
        }
        // Count character frequencies in str2 and find common characters
        for (char ch : s2.toCharArray()) {
            if (charCount1[ch] > 0) {
                commonCount++;
                charCount1[ch]--;
            }
        }
        return commonCount;
    }

}
