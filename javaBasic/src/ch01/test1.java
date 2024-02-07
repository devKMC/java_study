package ch01;

//정수 리스트 numList가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 메서드를 완성해주세요.
//음수가 없다면 -1을 return한다.
//메서드의 반환 타입은 정수 타입이고 메서드명은 solution, 
//매개변수의 타입은 정수의 배열로 받으면서 접근 제어는 모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 
//가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.
//

class Solution {										//-메서드 솔루션
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        //[1] arr을 answer로 복사
        for(int i=0;i<arr.length;i++){
          answer[i] = arr[i]; 							
        }
        //[2] queries[i] 0,1,2
        for(int i=0;i<queries.length;i++){
            //[3] queries[][j] 0,1
            for(int j=0; j<queries[i].length; j++){
                int arrIndex = queries[i][j];
                answer[arrIndex]++;
            }
        }
        return answer;
    }
}






public class test1 {

	public static void main(String[] args) {
	
	
	}

}

