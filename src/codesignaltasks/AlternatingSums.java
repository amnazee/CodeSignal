package codesignaltasks;

import java.util.Arrays;

public class AlternatingSums {
    public static void main(String[] arg){
        int[] array={50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(solution(array)));
    }
    static int[] solution(int[] a) {
        int[] teams = new int[2];
        for(int i=0; i<a.length; i++){
            if(i%2==0){
                teams[0] += a[i];
            }
            else{
                teams[1] += a[i];
            }
        }
        return teams;
    }
}
