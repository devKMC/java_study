package ch02.review;


	class ConstructorClass{
		// 아래와 같은 상황을 '의존성을 내부에서 주입한다' 라고 함
		// 의존성을 내부에서 주입하는 상황은 지양(안)해야 함
		int instanceVariable1;
		double instanceVariable2;
		
		// 생성자 : 클래스의 인스턴스를 생성할 때 호출되는 메서드
		// 생성시에 실행할 코드를 구현한 메서드, 주로 인스턴스 변수 초기화 작업에 사용
		// 생성자를 개발자가 직접 작성하지 않으면 자바가 기본 생성자를 자동으로 생성
		
		// 규칙
		// 1. 클래스명과 동일한 이름을 가져야 한다
		// 2. 반환타입을 지정하지 않음  ( void )
		// 3. 인스턴스 생성후에 사용할 수 없음
		
		ConstructorClass() {} // 기본 생성자
		
		//생성자도 메서드이기 때문에 오버로딩이 가능하다
		ConstructorClass(int instanceVariable1){
			// this: 현재 인스턴스 혹은 클래스를 가르키는 키워드
			//글로벌 위치에 있는 변수 혹은 메서드를 지정할 때 사용
		
		this.instanceVariable1 =10; 
		this.instanceVariable2 =9.9;
		
			
		}
		
		ConstructorClass (int instanceVariable1, double instanceValuable2){
			//this(): 현재 클래스의 다른 생성자를 호출하는 키워드
			this(instanceVariable1);
			this.instanceVariable2 = instanceValuable2;
			
			
		}
		
	
		
		
	}
	
	public class A_Constructor { 
		
	public static void main(String[] args) {
		
		//생성자 사용
		ConstructorClass instance1 = new ConstructorClass();
		ConstructorClass instance2 = new ConstructorClass(1);
		ConstructorClass instance3 = new ConstructorClass(1, 1.1);
		
	
		
	}
	
}
