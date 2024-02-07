package ch02;//#6일차 5

// 기타 제어자 (비접근 제어자): 접근 제어와 무관하게 동작을 제어하는 것
// final 제어자:: 
// - 클래스: final 제어자가 붙은 클래스는 확장(상속)할 수 없음
// - 메서드: final 제어자가 붙은 메서드는 오버라이드할 수 없음
// - 변수: final 제어자가 붙은 변수는 재할당할 수 없음

// 1.
final class FinalModifier {
	int variable;
}

//class SubModifier1 extends FinalModifier { //확장하는 작업 (오버라이딩)
//	
//}

// 2.
class FinalModifier2 {
	final void method() {}
}

class SubModifier2 extends FinalModifier2 { //확장하는 작업 (오버라이딩)
//	void method() {}
	
}

// 3.
class FinalModifier3 {
	final int variable = 0;					//초기화 작업
	
	void method() {
//		valuable = 20;						//재할당 작업
	}
	
}

//static 제어자:
// -메서드: static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
// -변수: static 제어자가 붙은 변수는 인스턴스 생성없이 클래스로 바로 접근 가능

class staticModifier {
	
	static int variable;
	
	static void method () {
		
	}
	
}


// 제어자의 조합 ★★★ 가장 많이 쓰이는 조합
class combination {
	
	// public + static + final ★★★
	public static final int NUMBER = 10;
	
	// 메서드에서 private + final (X) 사용하지 않음
	private final void method() {}
	
	// 메서드에서 private + abstract x (서로 상충)	// ?
	// 클래스와 메서드에서 final + abstract X ()           //반드시 오버라이딩을 해야함
		
	
		
	
}


public class D_Modifier { 

	public static void main(String[] args) {
		staticModifier.variable = 0;
		staticModifier.method();
		

	}

}
