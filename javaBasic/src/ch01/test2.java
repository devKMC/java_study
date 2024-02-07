package ch01;

import java.util.Arrays;
import java.util.Scanner;



//정수 배열 array와 2차원 정수 배열 queries이 주어진다.			 
//queries의 원소는 각각 하나의 query를 나타내며, [s, e] 형태다.
//각 query마다 순서대로 s ≤ i ≤ e인
// 모든 i에 대해 array[index]에 1을 더한다.
//위 규칙에 따라 queries를 처리한 이후의 array를 return 한다.
//메서드의 반환 타입은 정수의 배열이고 메서드명은 solution, 
//매개변수의 타입은 1차원 정수 배열 타입 array,
//2차원 정수 배열 타입 queries 로 받으면서 접근 제어는 모든 패키지에서 사용할 수 있도록 하며
//오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.
//

class  {										 
    public int[] solution(int[] arr, int[][] queries) { //		 2차원 정수 배열
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];						// [s, e] 형태다
            int e = queries[i][1];						// array[index]에 1을 더한다.
            for(int j=s; j<=e; j++){
                answer[j]++;
            }
        }
            
        return answer;
    }
}
public class test2 {

	public static void main(String[] args) {
	      
	  

	}

}
