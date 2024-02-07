package ch02_sub; //#6일차 4

// ch02에 선언된 AcessModifier 클래스는
// 접근 제어자가 default이기 때문에 외부 패키지에서 import가 불가능
//import ch02.C_AccessModifier; 	

// ch02에 선언된 C_AcessModifier 클래스는 (퍼블릭이 붙어 있음)
// 접근 제어자가 public이기 때문에 외부 패키지에서 import 가 가능
import ch02.C_AccessModifier; 					//퍼블릭이 있는건 임포트 가져와서 사용 가능
												//한 클래스에 퍼블릭이 2개올 수 없음

class SubClass extends C_AccessModifier {
	
	void method() {
		super.protectedVariable = 0;
	}
}

public class C_AccessModifierSub {

	public static void main(String[] args) {
		
		C_AccessModifier instance = new C_AccessModifier();
		
		//C_AccessModifier 클래스의 privateVariable 필드는
		//접근 제어자가 private  이기 때문에 외부 패키지에서는 접근이 불가능
//		instance.privatevariable = 0;
		
		//C_AccessModifier 클래스의 defaultVariable 필드는
		//접근 제어자가 default 이기 때문에 외부 패키지에서는 접근이 불가능
//		instance.defaultVariable = 0;						
		
		//C_AccessModifier 클래스의 defaultVariable 필드는
		//접근 제어자가 protected 때문에 외부 패키지에서는 접근이 불가능
		//단 C_AccessModifire 클래스를 확장한 클래스에서는 접근이 가능
		
		// 상단의 SubClass 참조
//		instance.protectedVariable = 0;  //이렇게는 접근이 안되고 12~17번 줄처럼 접근 가능
		
		//C_AccessModifier 클래스의 publicVariable 필드는
		//접근 제어자가 public 이기 때문에 외부 패키지에서는 접근이 불가능
		instance.publicVariable = 0;
		
//				instance.a = 0;			 //정의되지 않음 필드가 아니다
	
	}

}
