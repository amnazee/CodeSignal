package codesignaltasks;

public class CenturyFromYear {
    public static void main(String[] arg){
        int year=1905;
        System.out.println(solution(year));
    }
    static int solution(int year) {
        if (year % 100 == 0) {
            year = year / 100;
        } else {
            year = (year / 100) + 1;
        }
        return year;
    }

}
