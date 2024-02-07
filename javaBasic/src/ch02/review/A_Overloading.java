
package ch02.review;

class OverloadClass {
	
	// 오버로딩 : 하나의 클래스 내부에서 같은 이름의 메소드를 여러개 가질 수 있도록 하는 것 
	// 조건 
	// 1. 메서드의 이름이 같아야 함
	// 2. 매개변수의 조합이 달라야 함 ( 타입, 개수, 순서 )
	// 3. 반환타입과 매개변수의 이름은 오버로딩에 영향을 주지 않는다
	
	//예시 (오버로딩 할 수 있는 경우)
	void method() {}
	
	void method (int arg) {}
	
	void method (double arg) {}
	
	void method (int arg1, double arg2) {}
	
	void method (double arg1, int arg2) {}
	
	//==============================================//
	
	//예시 (오버로딩 불가능한 경우)
	
	// int method() {}
	
	//void method (int parameter) {}
	
	//==============================================//
	
	// 오버로딩 장점:
	// 1. 코드의 일관성과 가독성을 향상 시켜줌
	// 2. 다형성 지원으로 코드의 확장성을 향상 시켜줌
	
public class A_Overloading {

	public static void main(String[] args) {
		
	

	}

}
}

