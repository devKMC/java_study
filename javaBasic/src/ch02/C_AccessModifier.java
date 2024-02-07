package ch02; //#6일차 3

//접근 제어자: 클래스, 필드, 메서드에 대해서 외부 접근에 대한 제어를 하는 것
// private : 같은 클래스 내부에서만 접근 가능 ★
// default : 같은 패키지 내부에서만 접근 가능 (기본 생성자)
// protected : 같은 패키지 내부 혹은 외부 패키지의 자손 클래스에서만 접근 가능
// public : 모든 패키지에서 접근 가능 ★

class AccessModifier {
	
	void method() {
		C_AccessModifier instance = new C_AccessModifier();
		
		//C_AccessModifier 클래스의 privateVariable 필드는
		//접근 제어자가 private  이기 때문에 외부 클래스에서는 접근이 불가능
//		instance.privatevariable = 0;
	}
	
}

// ch02_sub의 C_AccessModifierSub 클래스와 같이 참조
public class C_AccessModifier {
	private int privatevariable;
	int defaultVariable;				//디폴트입니다 
	protected int protectedVariable;
	public int publicVariable;
	
	void method() {
		//C_AccessModifier 클래스의 privateVariable 필드는
		//접근 제어자가 private  이기 때문에 외부 클래스 내부에서만 사용 가능
		this.privatevariable = 0;
	}
	
	}









