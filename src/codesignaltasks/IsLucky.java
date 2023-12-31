package codesignaltasks;

public class IsLucky {
    public static void main(String[] arg){
        int n=1230;
        System.out.println(solution(n));
    }
    static boolean solution(int n) {
        String ticketStr = Integer.toString(n);
        if (ticketStr.length() % 2 != 0) {
            return false;
        }
        int halfLength = ticketStr.length() / 2;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < halfLength; i++) {
            firstHalfSum += Character.getNumericValue(ticketStr.charAt(i));
            secondHalfSum += Character.getNumericValue(ticketStr.charAt(i + halfLength));
        }
        return firstHalfSum == secondHalfSum;
    }
}
