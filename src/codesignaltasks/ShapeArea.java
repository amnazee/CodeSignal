package codesignaltasks;

public class ShapeArea {
    public static void main(String[] arg){
        int n=2;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int area=0;
        if(n<1){
            System.out.println("Cannot find area of number below 1");
        }
        else{
            area=2*(n*n)-2*n+1;
        }
        return area;
    }
}