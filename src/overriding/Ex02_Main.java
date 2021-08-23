package overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa(){
		System.out.println("나만의 기능입니다");
	}
	
	/*
	//오버라이딩 개념
	public Object get(int modCount) {
		return super.get(modCount)+"내가 만든 기능";
	}
	*/
	
	//이것도 오버라이딩 개념
	@Override
	public Object get(int i) {
		return "내가 만든 get이다";
	}
	
	//오버라이딩
	public boolean add(Object o) {
		System.out.println("추가하는 기능 입니다");
		return true;
	}
}

final class BB {//final이 붙으면 상속을 못한다. 변경을 못하도록 막는것
	public void bb() {
		System.out.println("bb의 기능입니다");
	}
}
	class CC {
		BB b = new BB();
		public void bb() {
			b.bb();
			System.out.println("cc의 기능입니다");
		}
	}
	

public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();
		
		//이 방법보다
		//ArrayList arr = new ArrayList();
		//String s;
		
		//이게 더 편하다
		a.add("안녕하세요");
		System.out.println("저장값 : " + a.get(0));
		
		

	}

}
