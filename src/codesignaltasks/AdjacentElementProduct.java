package codesignaltasks;

public class AdjacentElementProduct {
    public static void main(String[] arg){
        int[] array={3, 6, -2, -5, 7, 3};
        System.out.println(solution(array));
    }
    static int solution(int[] inputArray) {
        int max=inputArray[0]*inputArray[1];
        for(int i=0; i<inputArray.length-1; i++){
            int product=inputArray[i]*inputArray[i+1];
            if(max<product)
            {
                max=product;
            }
        }
        return max;
    }
}
