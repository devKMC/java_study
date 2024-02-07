package ch02;

class ExampleClass2 {
	static int number = 3;
	double doubleNumber;


	Sample1 method() {		  //					
		Sample1 sample = new Sample1();
		sample.data = - 456;
		return sample;
	}
	
	static void staticMethod() {
		
	}
	
}

class Sample1 {
	int data;
	
	Sample1 () {}
	Sample1 (Sample1 sample){
		this.data = sample.data;
	}
}

public class A_JVM {

	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		sample = instance1.method();
		
		System.out.println(sample.data);
		
		int number2 = number;
		number2++;
		System.out.println(number);
		System.out.println(number2);
		
		Sample1 sample2 = sample;
		sample2.data++;
		System.out.println(sample.data);
		System.out.println(sample2.data);
		
		Sample1 sample3 = new Sample1(sample);
		System.out.println(sample.data);
		System.out.println(sample3.data);
		sample3.data++;
		System.out.println();
		
		// 생성자를 사용한 복사
	}

}




//
//// 메서드 영역               힙 영역             			스택 영역
////이그잼플클래스			example.class.instance			main
////		넘버			double number     (9.9)			instance1 =  35
////		더블넘버										instance2 =  36
//		스태틱메소드
//														numbewr= 0 
//A_JVM
//	main()

//														instance method()
//														arg =    0           위의 영역을 복사해서 가져옴

//참조변수는 찾아가서 그 값을 바꾼다 ( 스택 영역 )
//매개변수로 들어가고 나오는것은 전부 복사되어 들어가고 나가면서 없어지고 원본이 존재함 ★★★★★★★★★★★★★★★★★★★















