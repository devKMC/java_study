package ch02;
//galaxyPhone
//제조사 : (maker - String)
//모델명 : (modelName - String)
//소유자 : (owner - String)
//번호  : (telNumber - String)
//전원상태 : (power - boolean)
		
		
// 전원버튼누름    : onPower - power 상태를 부정
// 전화걸기		  : call - power가 true 일 때 "(상대 전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기    : emergency - "112로 전화를 겁니다." 출력
// 휴대전화정보보기 : getInformation - 


// 출력할 것들
// ====( 전화번호) ====
// 제조사: (제조사)
// 모델명: (모델명)
// 소유자: (소유자)
//
//-------------------------------------------------------------------------------
// 위에까지는 클래스 명세서라고 말함 (이정표 , 유지보수 , 문서화하는 작업)
//--------------------------------------------------------------------------------
	//같은 기능이나 같은 속성을 묶을 때 클래스를 사용함
	//컴퓨터 = CPU 메모리 운영체제 하드웨어 등 속성을 가짐 필드라고 부름
	//기능 = 메서드라고 부름
	//인스턴스 , 스태틱이있는데 인스턴스는 독립적 
	//인스턴스는 인스턴스에서만 사용함
	//스태틱변수는 클래스에서만 사용 가능
	//클래스는 클래스안에서 서로 공유
//--------------------------------------------------------------------------------

//출력
class galaxyPhone {   // 속성과 상태를 나타냄 인스턴스변수임 = 
					  // 을 붙여서 사용할 수 있게 만드는게 인스턴스임 s23 , s24 으로 인스턴스 만듬 ★ / S 23 maker를 삼성으로 전체지정을하면서 s24에 영향을안줌 이게 인스턴스를 사용한거임
						// 지정한 순간 할당됨 그후 인스턴스만들면 메이커 뺴고 복사해서 그밑 작업들만 들어감 // 그후에 S24도 23처럼 만듬 // 만약에 maker를 LG로 변경시 전체변경 됨
					//static String maker에 static이 없으면 메이커를 싸잡아서 변경하지 못함  //엑셀에서 설명한 하나하나 블럭이 변수
	
	static String maker;
	String modelName;
	String owner;
	String telNumber;
	boolean power;   //스위치처럼 해야해서
	
	void onpower () {     // 원래의 논리값 power의 부정값         						    전원버튼
		power = !power;   // 부정연산자를 사용하여 부정값 입력       
	}    
	
	void call (String toTelNumber) {       								 // 외부에서 가져와야함 전화번호가 있어야하기에        전화걸기
	if (!power) return; //이상태일때는 밑에를 실행하지말아라고 return 사용		   	// 이것이 참 (true) 일때만 실행하라고 if를 사용함 ex)if(power); 가능
	System.out.println(toTelNumber + "로 전화를 겁니다.");
	}
	
	static void emergency () {
		System.out.println("112로 전화를 겁니다.");
	}
	void getInformationn() {                                        // 클래스에 직접 속하지 않은 인스턴스에 직접 속함 , 복사본 만든다 호출하기 쉬움
		if (!power) return;  //
			System.out.println("===="+ telNumber + "====");
			System.out.println("제조사 : " + maker);
			System.out.println("모델명 : " + modelName);
			System.out.println("소유자 : " + owner);
		}
	
}
		
// Drama 예제
// 방송사 : (boardcastingCompany) - String
// 제목	: (title - String)
// 배우	: (actors - String[]) 			 string 으로 잡으면 1명만 출현 , 그래서 배열로
// 장르	: (genre - String)
// 시청률 : (viewerRating - double)
// 부작	: (series - int)

// 정보보기(기능 구현) : getInformation
// ===== (title) =====
// 방송사 : (boardcastingCompany)
// 장르  : (genre)
// 부작  : (series)부작
// 시청률 : (viewRating)
// 배우  : (actor), (actor), (actor)...      [] 전지현 , 김수현 , 박해진 , 유인나
class Drama { 
	String boardcastingCompany;
	String title;
	String[] actors;
	String genre;
	double viewerRating;          
	int series;
	
	void getinformation() {
		System.out.println("===" + title + " ===");
		System.out.println("방송사 : " +  boardcastingCompany );
		System.out.println(" 장르 : " + genre );
		System.out.println(" 부작 : " +  series + "부작");
		System.out.println(" 시청률 : " +  viewerRating + "%");
		System.out.println(" 배우 : " );
		for (int index = 0; index < actors.length; index++) {
//			System.out.println(actors[index]);													  방법 1
//			if (index < actors.length - 1) System.out.print(",");
//			// index < actors.length - 1 
			//true - actors[index] + "," / false - actors[index]
//			System.out.println(index < actors.length -1 ? actors[index] + "," : actors[index]);   방법 2
			String actor =index < actors.length -1 ? actors[index] + "," : actors[index];		//방법 3
			System.out.print(actor);
		}
		System.out.println();
			
//			System.out.println(index < actors.length -1 ? actors[index] + "," : actors[index]);
			
		
		

		
	}
}
	
	
// 삼각함수 예제                  
// TriangleMath 			   (클래스 생성)
// 빗변 구하기 - getHypotenuse		타입의 형태 변수명 (매개변수) {
// 둘레 구하기 - getCircumference  ""
// sin 구하기 - getSin			""
// cos 구하기 - getCos			""	
// tan 구하기 - getTan			""

class TriangleMath {   //인스턴스이므로 인스턴스를 생성을 해줘야함 꼭 맨 밑 에다가
	
//	static final double PI = 3.14; SOLID 의 S 단일 책임 법칙 에 의거해 안됨
	
	static double getHypotenuse (int bottom, int height) {   //밑변과 높이
			if(bottom <= 0 || height <=0) return 0;
			if(!(bottom > 0 && height > 0)) return 0;
				
	double result = Math.pow(bottom, 2) + Math.pow(height, 2);
			return Math.sqrt(result);
	}
	static double getSin (int height, int hypotenuse) {
		if(height <= 0 || hypotenuse <=0) return 0;
			return height / hypotenuse;
	}
	static double getCircumference (int height, int bottom, int hypotenuse) {
		if(bottom <= 0 || height <=0 || hypotenuse <=0) return 0;
		return height + bottom + hypotenuse;
			
	}
	static double getCos(int bottom, int hypotenuse) {
		if(bottom <= 0 || hypotenuse <=0) return 0;
		return bottom / hypotenuse;
	}
	static double getTan(int height, int bottom) {
			return height / bottom;
	}
}





public class A_Example {											

	public static void main(String[] args) {							// 메인 메소드에는 static이 붙어있어 호출해서 가져와서 쓴다
		
	galaxyPhone s23 = new galaxyPhone();  //참조형 데이터를 가져와 생성함
	galaxyPhone s24 = new galaxyPhone();
	
	galaxyPhone.maker = " SAM SUNG "; //상세 코드에 메이커를 생략하고 전체 메이커를 삼성으로 바꿈
	
	//s23.maker = "SAMSUNG";
	s23.modelName = "s23";
	s23.owner = "홍길동";
	s23.telNumber = "010 - 0000 - 0000";
	s23.power = false;
	
	//s24.maker = "SAMSUNG";
	s24.modelName = "s24";
	s24.owner = "고길동";
	s24.telNumber = "010 - 1111 - 1111";
	s24.power = false;
	
	s23.onpower();
	s23.getInformationn();
		
	
	galaxyPhone.emergency();

	s23.emergency();
	s24.emergency();
	
	// 드라마 구현
	 Drama star = new Drama();  // Drama star(담고 있는 참조변수)    , 인스턴스(new Drama(); 생성 
	 star.boardcastingCompany = "SBS";										// 이 이후로는 star라는 걸로해서 초기화
	 star.title = "별에서 온 그대";
	 star.actors = new String[] {"전지현", "김수현", "박해진", "유인나"};
	 star.viewerRating = 28.1;
	 star.series = 21;
	 
	 star.getinformation();    // () 붙으면 메소드
	
	TriangleMath tranTriangleMath = new TriangleMath();
	double bit = tranTriangleMath.getHypotenuse(3, 4);
	System.out.println(bit);
//	System.out.println(tranTriangleMath.PI); 	SOLID 의 S 단일 책임 법칙 에 의거해 안됨
	//TriangleMath.PI = 0.0; 
	}
	
	

}
