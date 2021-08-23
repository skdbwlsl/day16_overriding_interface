package casting;
class A01{
	public void getText() {
		System.out.println("A클래스");
	}
}

class B01 extends A01{//오버라이딩이 된것이다. getText로 모두 이름이 같기 때문에
	public void getText() {
		System.out.println("B클래스");
	}
}

class C01 extends A01{
	public void getText() {
		System.out.println("C클래스");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		/*
		 up casting(형변환)
		 - 자식 형태의 값을 부모 형태로 변환하는 것
		 
		 down casting(형변환)
		 - 부모 형태에서 자식형태로 변환하는 것
		 */
		
		/*
		 원래 사용하던 방식
		B01 b = new B01();
		b.getText();
		C01 c = new C01();
		c.getText();
		*/
		
		//upcasting
		A01 a = new B01(); //자식(B01) 형태의 값을 부모 형태로 저장한다(A01), 하나의 변수만(A01 a) 만들어서 같이 사용하겠다
		a.getText();
		a= new C01();
		a.getText();

	}

}
