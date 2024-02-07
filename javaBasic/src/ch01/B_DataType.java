package ch01;

public class B_DataType {

	public static void main(String[] args) {
		
		// 기본형 데이터 타입
		// 정수형 데이터 타입 (실수가 없는 정수를 나타냄)
		
		// byte : 1byte(8bit) 의 크기를 가지는 정수형 데이터 타입
		// -127 ~ 128		
		byte byte1 = 127;
		//byte byte2 = 128;
		
		//short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32768 ~ 32767		
		short short1 = 32767;
		//short short2 = 32768;
		
		//int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// -2,147,483,648 ~ 2,147,483,647
		int int1 = 2_147_483_647;
		//int int2 = 2_147_483_648;
		
		//long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		//long long1 = 2_147_483_648;
		long long1 = 2_147_483_648L; // l을 사용해서 long 으로 변환
		
		
		
		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(int1);
		System.out.println(long1);
		
		
		//실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		
		//float : 4byte (32bit) 크기를 가지는 실수형 데이터 6~7자리에서 오차 발생	
		float float1 = 3.1415926535F;
		System.out.println(float1);
		
		
		//double : 8byte (64bit) 크기를 가지는 실수형 데이터 15~17자리	오차 발생
		double double1 = 3.1415926535;
		System.out.println(double1);
		
		//문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입 
		//char : 2byte (16bit) 의 크기를 가지는 문자형 데이터 타입
		//0 ~ 65535 까지 저장 가능
		
		char char1 = 'a';
		char char2 = 97;
		
		System.out.println(char1);
		System.out.println(char2);
		
		
		// 논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		// boolean = 8bit ( 1byte )의 크기를 가지는 논리형 데이터 타입
		// true , false
		
		boolean boolean1 = true; //1000000
		boolean boolean2 = false;  
		
		// 형 변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		
		// 자동 형 변환 (묵시적 형변환): 작은 데이터 타입의 변수를 큰 데이터 타입의 변수로 담을 때
		int number = 10;
		long longNumber = number;
		
		System.out.println(number);
		
		// 강제 형 변환 (명시적 형 변환): 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을 때
		// 할당 하고자 하는 큰 데이터 타입 변수 앞에 (작은 데이터타입)을 붙여줌
		
		number = (int) longNumber;	
		number = 256;
		byte byteNumber =(byte) number;	
		System.out.println(byteNumber);
		
		short shortNumber = 97;
		char character = 97;
		//shortNumber = character;
		int intNumber = 100;
		float floatNumber = 100;
		//intNumber = floatNumber;
		
		int age1 = 10 , age2 = 20, age3 = 30, age4 = 40, age5 = 50;
		
		// 배열 : 동일한 타입의 변수를 저장하는 컨테이너
		// new 연산자를 이용해서 생성을 한다
		// 한번 생성된 배열의 크기는 변경할 수 없음
		
		//순서 (배열)
		// 선언 : 데이터타입 [] 변수명(배열명); 
		// 생성 : 변수명에 데이터타입[크기];
		
		int[] numbers;
		numbers = new int [5]; //길이는 5 , 인덱스 4
		
		System.out.println(numbers);		
		
		int[] numbers2 =  {1, 2, 3, 4, 5};
		int[] numbers3 = new int[] {1, 2, 3, 4, 5}; //생성과 동시에 출력
													//new가 들어가면 주소를 입력한다고 생각해야함 (참조형 데이터타입)
		System.out.println(numbers2);
		System.out.println(numbers3);
		
		//배열의 요소에 접근할때 '인덱스'를 사용함
		//인덱스는 0번부터 시작 마지막 인덱스는 길이 - 1
		int item = numbers2[0];
		System.out.println(item);		
		item = numbers[0];
		System.out.println(item);		
		numbers[0] = 99;
		System.out.println(item);		
		item = numbers[0];
		System.out.println(item);  
		
		System.out.println("============================");

		System.out.println("============================");
		System.out.println("============================");
		//인덱스 범위를 초과하는 인덱스에 접근할 시 예외 발생
		//System.out.println(numbers[5]); //콘솔오류 ( 동작 오류 )
		
		//데이터 타입의 큰틀 기본형 / 참조형 (new , 대문자로시작하는 것) (참조형은 주소가 들어가는 것이다)
		
//		numbers : {99, 0, 0, 0, 0}; [I@36aa7bc2 첫번째 인덱스의 변수주소가 입력됨
		numbers2 = numbers;
//		numbers2 : {99, 0, 0, 0, 0};[I@36aa7bc2 첫번째 인덱스의 변수주소가 입력됨
		System.out.println(numbers);
		System.out.println(numbers2);
		
		
		//주소로 변수를 바꿈
		numbers[4] = -99;
//		numbers : {99, 0, 0, 0, -99};
//		numbers2 : {99, 0, 0, 0, 0};
//		System.out.println(numbers2[4]);
		
		System.out.println(numbers[4]);
		System.out.println(numbers2[4]);
		
		//주소가 아닌 그냥 변수에 데이터타입을 대입해서 미리 안바뀌고 순서대로 바뀜
		int number1 = 0;
		int number2 = number1;
		number1 = -99;
		System.out.println(number1);
		System.out.println(number2);

		char[] chars1 = {'a', 'p', 'p', 'l', 'e'};  //char 는 크기변경 불가 x (글자수)
		System.out.println(chars1);
		
		//String : 문자열을 표현하는데 사용되는 참조형 데이터 타입
		// 문자열을 다루는데 유용한 기능을 제공해주고 있음
		String string1 = "apple";
		
		// String의 주요 기능
		String statement = "  My name is iornman  ";
		
		//JVM(기계어 컴파일러) JRE(환경) JDK(도구)
		//스트링은 JRE 라이브러리 ex:java.lang.string
		
		
		// 1. 문자열 결합
		// + 혹은 concat(문자열)으로 두 문자열을 연결할 수 있음
		System.out.println(statement + "!!!");
		System.out.println(statement.concat("???"));
		
		// 2. 문자열 비교
		// equals(문자열) : 두 문자열이 동등한지 비교
		// compareTo(문자열) : 두 문자열이 사전순으로 비교	
		System.out.println(		statement.equals("My name is hulk") );
		System.out.println(		statement.compareTo("Apple") );
		System.out.println(		statement.compareToIgnoreCase("Apple") );
		
		// 3. 문자열 길이
		// length(): 문자열의 길이를 반환 
		System.out.println(statement.length() );
		
		// 4. 문자열 변환
		// toUpperCase(): 모든 문자를 대문자로 변경
		// toLowerCase(): 모든 문자를 소문자로 변경
		// trim(): 문자열의 앞뒤 공백을 모두 제거
		System.out.println(		statement.toUpperCase() );
		System.out.println(		statement.toLowerCase() );
		System.out.println(		statement.trim() );
		
		// 5. 문자열 찾기
		// indexOf(문자열): 찾고자하는 문자열의 처음 찾은 위치의 인덱스 번호
		// lastIndexOf(문자열): 찾고자하는 문자열의 마지막 찾은 위치의 인덱스 번호
		statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘못 그린 기린 그림이다";
		System.out.println(		statement.indexOf("그림") );
		System.out.println(		statement.indexOf("하마") );
		System.out.println(		statement.indexOf("그") );
		System.out.println(		statement.lastIndexOf("그림") );
		System.out.println(		statement.lastIndexOf("하마") );
		
		// 6. 부분 문자열
		// substring(시작인덱스), substring(시작인덱스, 종료인덱스): 문자열을 원하는 크기만큼 추출
		System.out.println(		statement.substring(48) );
		System.out.println(		statement.substring(3,10) );
		
	
	
		// null : 아직 어떠한 값도 지정되지 않은 상태 ★★★
		String string2 = null;
		System.out.println(string2);
		System.out.println(string2.substring(48) );
		
		//참조형하면 무조건 주소 ★		
		
		
	
	}

}
