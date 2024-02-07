package ch02; //7일차 3 ---> sub message

// 인터페이스에서 스태틱이 가장 많이 사용 됨

// 추상메서드로만 구현되어있음
// 인터페이스 : 클래스가 구현해야만하는 메서드들을 선언하는 참조 타입 (클래스의 참조 타입은 추상 , 인터페이스)
// 인터페이스의 모든 변수는 public, static, final 형태가 와야함
// 인터페이스의 모든 메서드는 public, abstract 형태가 와야함 (default , static 메서드가 올 수도 있음)
// 인터페이스는 다중 구현이 가능함                                                                       
// ㄷㅅㅂㄱ

// 넓이 공식
// 삼각형 넓이 구허기    -Double 밑변, Double 높이 -> Double 삼각형넓이
// 정사각형 넓이 구허기   -Double 변 -> Double 정사각형넓이
// 직 사각형 넓이 구허기  -Double 밑변, Double 높이 -> Double 직사각형넓이
// 원 넓이 구허기		-Double 반지름, (Double 원주율 바뀌지 않기에 생략 가능) -> Double 원넓이



// 기능 = 인터페이스를 써라

//접근제어자 interface 인터페이스명 { ................}
//기능 (로직)
interface AreaCalculation {
	
	public static final double PI = 3.14;
	
	public abstract double getTriangleArea(double bottom, double height);
	public abstract double getSquareArea(double side);
	public abstract double getRectangleArea (double bottom, double height);
	public abstract double getCircleArea (double radius);
	
}	


// 인터페이스는  implements 키워드를 이용해서 클래스를 구현해야함
class MyMath implements AreaCalculation {

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height /2;
	}

	@Override
	public double getSquareArea(double side) {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		// TODO Auto-generated method stub
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {
		// TODO Auto-generated method stub
		return radius * PI;
	}
	
	
	class MyMath2 implements AreaCalculation {
		@Override
		public double getTriangleArea(double bottom, double height) {
			return bottom * height /2;
		}

		@Override
		public double getSquareArea(double side) {
			// TODO Auto-generated method stub
			return Math.pow(side, 2);
		}

		@Override
		public double getRectangleArea(double bottom, double height) {
			// TODO Auto-generated method stub
			return bottom * height;
		}

		@Override
		public double getCircleArea(double radius) {
			// TODO Auto-generated method stub
			return radius * PI;
		}
		
		
	}
	
	


}
	



public class G_Interface {

	public static void main(String[] args) {
		AreaCalculation instane = new MyMath(); // 역전의존성원칙 업캐스팅 개방폐쇄법칙


	}

}


// 마방진 첫 시작은 행 가운데에서 우측 위로 올라감 , 자리가 없으면 넘어가서 대입됨, 만약 지나온자리가 있다면 밑으로 한칸 