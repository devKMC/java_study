package ch02.review;


public class A_instance {

	public static void main(String[] args) {
		
		// 객체 (인스턴스): 클래스에 정의된대로 만들어진 독립적인 실체
		// 객체는 클래스로 '생성'하는 작업이 이루어짐 (독립적인 실체를 만드는 행위)
		// 생성하는 방법 : new 연산자를 사용하여 생성
		// new 클래스명(); <-- 인스턴스 생성
		
		ExampleClass instance = new ExampleClass(); // <-- 인스턴스를 생성 (우항) , 선언(좌항)
													// 같은패키지가 아닐때 컴파일러 에러가 뜸
		// 참조 : 아래 코드는 변수를 선언
		int Number; 
		ExampleClass example;
		
		// 참조 : 아래 코드가 인스턴스
		new ExampleClass();
		
		// 인스턴스 변수와 메서드 접근 혹은 호출: 인스턴스.변수 / 인스턴스.메서드()
		
		instance.instanceVariable = 0;
		instance.instanceMethod();
		new ExampleClass().instanceVariable = 0; // 가능은 하다z
		
		//참조 아래 코드는 인스턴스가 복사된 것이 아니라 인스턴스의 주소가 복사되어 할당 되는 것
		ExampleClass anotherInstance = instance; // 주소가 복사됨
		
		
	}

}
