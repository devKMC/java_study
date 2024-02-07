package ch01; 

import java.util.Scanner;

public class D_control {

	public static void main(String[] args) {

		//제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		//조건문 : 특정 조건을 만족하면 코드를 실행 , 만족하지 않으면 실행 x
		//if 문 : 주어진 조건이 true 이면 코드를 실행 , false 이면 코드를 실행 x
		
		// 예시 ) if (조건-논리표현식) { 실행할 코드 }
		Scanner scanner = new Scanner(System.in);
		
		int age = 18;
		
		//age는 17 보다 크거나 같으면서 , 19보다 작거나 같아야함 
		//age >= 17 && age <= 19
		
		//age는 17보다 크거나 같거나 , 19보다 작거나 같아야함   
		//age >= 17 || age <=19
		
		// 부정연산자 : 논리 표현식을 부정하는 연산자
		// ! 논리 : true 면 false , false 면 true를 반환
		
		boolean isHighSchool = age >= 17 && age <= 19;  
		if (!isHighSchool) {
			System.out.println("고등학생입니다 ");
		}
			System.out.println("프로그램 종료");
		
		
		//else : if 문의 조건-논리표현식이 'false'면 코드를 실행
		//if (조건-논리표현식) { 'true'이면 실행할 코드 }
		//else { 'false'이면 실행할 코드 }
			
		// 1. else문은 반드시 if문 이후에 와야함 (else 단독으로는 사용 불가능)
		// 2. else문에는 조건을 작성하지 않음
			
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		
		age = 20;
		
		if (age>19) {
			System.out.println("성인입니다. "); //실행구문 1개 (세미클론 수)
		}
		else  {
			System.out.println("미성년자입니다. ");
		}
		
		System.out.println("프로그램 종료");
		
		//3일차
		
		String fruit = "수박";
		if (fruit.equals("사과")) {
			
		} else if (fruit.equals("바나나")) {
			
		} else if (fruit.equals("귤")) {
	
		} else {

				}
		
		// switch : 특정 변수 또는 값에 따라 실행할 코드 블록의 범위를 결정하는 것
//		switch (변수-일반표현식) {
//		case 값1 : 
//			변수-일반표현식이 같을 때 실행할 코드 위치
//		case 값2 :
//			변수-일반표현식이 같을 때 실행할 코드 위치
//			switch 내부에서 break 문을 만나면 switch 문을 종료
//			break;
//		case 값3 :
//			변수-일반표현식이 값3과 같을 시작할 코드 위치
//		default :
//			변수-일반표현식이 case의 값과 일치하는 것이 없거나 
//			바로 위에서 break문을 만나지 않으면 실행되는 코드
//		}
		
		int input = 5;
		// input이 0이면 ABC를 출력
		// input이 1이면 BC
		// input이 2이면 C
		// input이 3이면 DEF
		// input이 4이면 EF
		// input이 0~4가 아니면 F
		
		
		switch (input){
		case 0:
			System.out.println("A");
		case 1:
			System.out.println("B");
		case 2:	
			System.out.println("C");
			break;
		case 3:
			System.out.println("D");
		case 4:
			System.out.println("E");
		default: // 고정값
			System.out.println("F"); 
		}
		
		// input이 0이면 A를 출력
				// input이 1이면 B
				// input이 2이면 C
				// input이 3이면 D
				// input이 4이면 E
				// input이 0~4가 아니면 F
		
		switch (input){
		case 0:
			System.out.println("A");
			break;
		case 1:
			System.out.println("B");
			break;
		case 2:	
			System.out.println("C");
			break;
		case 3:
			System.out.println("D");
			break;
		case 4:
			System.out.println("E");
			break;
		default: // 고정값
			System.out.println("F"); 
			break;
		}
		
		int a = 0, b = 0, c = 0;
		if (a == 1) {
		if (b == 2) {
		if (c == 3) {
			
			}
			if (a != 1) {
				System.out.println("비정상 ㄱ");
			if (a != 1) {
				System.out.println("비정상 ㅇ");
			if (a != 1) {
				System.out.println("비정상 ㄹ");
			
			}
			}
		}
			
	}
}
		System.out.println("==================================================");
		System.out.println("==================================================");
		
		// 반복문 : 특정 조건에 부합하면 지정한 코드를 여러 번 실행하도록 하는 것
		
		// for문 : 일반적 반복 횟수가 정해져있을 때 사용하는 반복문
		// for(조건에사용할변수초기화 ; 조건 ; 조건에사용할변수증감) {반복할 코드}
		
//		System.out.println("안녕하세요. ");
//		System.out.println("안녕하세요. ");
//		System.out.println("안녕하세요. ");
//		System.out.println("안녕하세요. ");
//		System.out.println("안녕하세요. ");
//		System.out.println("안녕하세요  ");
//		System.out.println("안녕하세요  ");
//		System.out.println("안녕하세요  ");
//		System.out.println("안녕하세요  ");
//		System.out.println("안녕하세요  ");
		
		// ...* 100
		
		x
			
//			System.out.println("안녕하세요.");
	}
//		System.out.println("-1번 안녕하세요.");
//		System.out.println("2번 안녕하세요.");
//		System.out.println("5번 안녕하세요.");
//		System.out.println("8번 안녕하세요.");
//		System.out.println("11번 안녕하세요.");
		
	
		for (int count = 1; count <= 5; count++) {
		
			System.out.println((3*count-4) + "번 안녕하세요");
							//	3n-4= -1
		}
		
		System.out.println("============================");
		System.out.println("2 * 1 = 2" );
		System.out.println("2 * 2 = 4" );
		System.out.println("2 * 3 = 6" );
		System.out.println("2 * 4 = 8" );
		System.out.println("2 * 5 = 10" );
		System.out.println("2 * 6 = 12" );
		System.out.println("2 * 7 = 14" );
		System.out.println("2 * 8 = 16" );
		System.out.println("2 * 9 = 18" );
		
//		for(int oo=1; oo <=9; oo++ ) {
//			System.out.println((2*oo));
//
//		for (int n = 1; n <=9; n++) {
//			System.out.println("2" + n + "=" + 2*n );
//		}
//		}
//		
//		for (int n = 1; n <=9; n++) {
//			System.out.println("3"+ n + "=" + 3*n );
//		}
//		
		// ...
		
//		for (int n = 1; n <=9; n++) {
//			System.out.println("3"+ n + "=" + 3*n );
//		
			
			
//		}
//		for (int dan = 2; dan <= 9; dan++) {
//			for (int n = 1 ; n <= 9; n++) {
//				System.out.println(dan + " * " + n + "=" + dan *n);
//			}
//		}
		
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
//		for (int index = 0; index <= 4; index++) {   //배열이 알기쉬운 0부터 입력함
//			numbers[index] = index + 1;
//		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
		for (int index = 0; index < numbers.length ; index++) {
			System.out.println(numbers[index]);	
		}
		
//		
//		int [] arr = {1,2,3,4,5};
//		for (int  num : arr) {
//			System.out.println(num);
//		
//		}
//				A					B				D			
//		for (int index = 0; index < numbers.length ; index++) { A B C D B C D B C D ,,,,
//		(C) System.out.println(numbers[index]);
//		}
//		
//		
		//foreach : 컬렉션 (배열)의 각 요소를 하나씩 변수에 '복사'하여 사용하는 반복문
		 //for each를하면 초기화작업 없고,
		//변경 x 직접 바꿔줘야함 이와같이
		//numbers : { 1, 2, 3, 4, 5}
		
		for (int number : numbers) {  //여기서 int는 number의 타입 ,문자면 스트링
			System.out.println(number);
		}
		System.out.println("--------------------------");
		for (int number : numbers) {
			number= 1;
		}
//		for (int index = 0; index < numbers.length ; index++) {
		
//			numbers[index] = 0;
//		
//		}
		for (int number : numbers) {
			System.out.println(number);
		}
		
		// while : 반복할 횟수가 정해져있지 않을때 사용하는 반복문
		// 조건이 true인 동안 반복 , 조건이 false가 되면 반복 종료
		input = 1;
		
		while (input != 0 ) {            
			input = scanner.nextInt();  //외부에서 입력을 할때 사용하는 것
			if (input % 2 != 0) {		// 만약에 input %2가 0이면 2의배수가 아니면 출력하라
										// continue : 반복문에서 continue문을 만나면 조건 검사로 넘어감
				continue;				// 다시 while 조건으로 넘어가서 288번부터 다시 시작 (안에서 끝으로)
			}
			if (input == 0) {
				// break : 반복문에서 break문을 만나면 반복문을 종료
				break;                   // 완전히 밖으로 내보냄
			}
			System.out.println("입력 값 : " + input);
			System.out.println("while 반복문 실행중...");
			
		}
		
		System.out.println("while 반복문 종료! ");
			//	 A 				B    		C 			D
		for (int index1 = 0; index1 < 10 ; index1++) {
			if (index1 % 3 == 0) continue;
			if (index1 == 8) break;
			System.out.println(index1);
		}
		
	}
}
