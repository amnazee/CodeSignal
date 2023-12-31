package codesignaltasks;

public class MakeArrayConsecutive {
    public static void main(String[] arg){
        int[] array={6, 2, 3, 8};
        System.out.println(solution(array));
    }
    static int solution(int[] statues) {

        int temp=0;
        for(int i=0; i<statues.length; i++){
            for(int j=i+1; j<statues.length; j++){
                if(statues[i]>statues[j]){
                    temp=statues[i];
                    statues[i]=statues[j];
                    statues[j]=temp;
                }
            }
        }
        int N=statues.length;
        int count=statues[N-1]-statues[0]+1-N;
        return count;
    }

}
