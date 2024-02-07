package ch03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member{ //받아올 데이터 클래스화
	String name;
	int age;
	
	Member (String name , int age){ //반드시 받아올것을 this로 만듬
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {		// 오브젝트꺼를 상속 따로 상속 클래스를 만들지 않았기에
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
}

public class D_Data { // 이 클래스에 스태틱 변수로 저장하는 리스트 만들것 (빈리스트)

	static List<Member>  members = new ArrayList<Member>();    //프레임워크 빈 배열 리스트 생성
	
	public static void main(String[] args) {
		
		while(true) {					//반복문이기에 멈춰놓지 않으면 무한반복임
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("작업 : ");
			String input = scanner.nextLine();
			if(input.equals("종료")) break; // 종료라는 입력이 들어오면 강제로 브레이크
			if(!input.equals("입력") && !input.equals("보기")) continue;
			
			// '입력' 라는 입력을 받으면 members 리스트에 요소 추가
			if(input.equals("입력")) {
				System.out.print("이름 : ");
				String name = scanner.nextLine();
				System.out.print("나이 : " );
				int age = scanner.nextInt();
				System.out.println(name + " " + age);
				
			// 입력받은걸로 멤버에 인스턴스 만들겁니다 (네임과 이미지를 받는)
				Member member = new Member(name, age);
									//array 멤버 
				members.add(member);// 여기까지하면 치는대로 저장됨
			
			}
			
			// '보기' 라는 입력을 받으면 members 리스트를 보여줌
			if(input.equals("보기")) {
			System.out.println(members);
			}
					
		}

	}

}
