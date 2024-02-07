package Problom4;

public class Problom2 {

    public int[] solution(int[] array, int[][] queries) {
        for (int[] query: queries)
            for (int index = query[0]; index <= query[1]; index++) array[index]++;
        
        return array;
    }
    
}