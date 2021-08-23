package interface_ex;

import java.util.Scanner;


//interface는 implements를 통해 상속을 받는다.
class B지상군 implements A공방{
	public void 총알구비() {
		System.out.println("총알을 장접 합니다");
	}

	@Override
	public void attack() {
		총알구비();
		System.out.println("지상군이 공격 합니다");
	}
	
	public void 방패착용() {
		System.out.println("방패를 착용합니다");
	}

	@Override
	public void defense() {//그냥하면 오류나기때문에 무조건 오버라이딩 해야한다
		방패착용();
		System.out.println("지상군이 방어 합니다");
		
	}
}

class B공군 implements A공방{

	@Override
	public void attack() {
		System.out.println("공군이 공격 합니다");
		
	}

	@Override
	public void defense() {
		System.out.println("공군이 방어 합니다");
		
	}
}

public class Ex02 {
	public static void main(String[] args) {
		B지상군 지상군 = new B지상군();
		B공군 공군 = new B공군();
	
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int choice = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num==1)System.out.println("지상군 선택");
		else System.out.println("공군 선택");
		
		System.out.println("1.공격 2.방어");
		choice = input.nextInt();
		
		if(choice == 1 && num==1) 지상군.attack(); //인터페이스 쪽에서 공격은 무조건attack, 방어는 무조건 defense이다 통일해서 쓰는것, 이름만 지정해서 쓴다고 생각하자
		else if(choice ==2 & num==1) 지상군.defense();
		if(choice==2 && num==2) 공군.attack();
		else if(choice==2 && num==2) 공군.defense();
		
		
		//메인부분을 upcasting으로 바꿔보자
		/*
		A공방 공방 = null;
		if(num==1) {
			System.out.println("지상군 선택");
			공방 = new B지상군();
		}
		else {
			System.out.println("공군 선택");
			공방 = new B공군();
		}
		System.out.println("1.공격 2.방어");
		choice = input.nextInt();
		if(choice==1) 공방.attack();
		else 공방.defense();
		*/
		
	}
}
