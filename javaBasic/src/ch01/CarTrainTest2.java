package ch01;


//자동차 종류: 수동 변속기 자동차 (ManualCar) 자동 변속기 자동차(AutomaticCar)
//기차의 종류: 여객 열차(PassengerTrain) 화물 열차(FreightTrain)





abstract class Car{									// 자동차 (모든 패키지에서 접근 가능)
	  
private	String vin;
private	String color;
private	boolean issert;

		
	}

abstract class TrainClass {							// 열차 (모든 패키지에서 접근 가능

	
private String trainNumber;
private String departureStation;
private String arrivalStation;
private boolean isStart;
}
 class ManualCar extends Car {						//수동 변속기 자동차 (모든 패키지에서 접근 가능)
	
	private int gear;
	void setGear() { 
}
	
class AutomaticCar extends Car{						//자동 변속기 자동차 (모든 패키지에서 접근 가능)
	private int gear;
	void setGear() { 
}

class PassengerTrain extends TrainClass{			// 여객 열차 (모든 패키지에서 접근 가능)
	private int passengerCount;
}

class FreightTrain extends TrainClass{				// 화물 열차 (모든 패키지에서 접근 가능)
	void setstart() {
		
	}
}

interface AreaCalculation {
	
	public static final double PI = 3.14;
	
	public abstract double getTriangleArea(double bottom, double height);
	public abstract double getSquareArea(double side);
	public abstract double getRectangleArea (double bottom, double height);
	public abstract double getCircleArea (double radius);
	


	}
}



public class CarTrainTest2 {

	public static void main(String[] args) {
		

		
		
	}



 
