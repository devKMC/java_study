package ch01;

//Scanner에서 컨트롤 + 스페이스바 누르면 임포트해서 생성됨
import java.util.Scanner;

public class ConsoleIO {

	public static void main(String[] args) {

		// 콘솔 출력 
		// System 클래스의 out 객체의 print(), println()
		// print() : 출력이 끝나고 줄 바꿈을 하지 않음
		// println() : 출력이 끝나고 줄 바꿈을 진행 함
		
		String name = "John Doe";
		System.out.println(name);
		System.out.println(name);
		
		// 콘솔 입력
		// java.utill.Scanner 클래스의 객체를 생성해서 nextXX() 메소드를 입력을 받음
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		
	
		int age = scanner.nextInt();
		
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
		scanner.close(); //시스템한테 빌린 자원을 되돌려주는 것
		
		
		
		  
		
		
		
		
		
		
	}

}
