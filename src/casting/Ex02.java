package casting;

class Parents{
	public void familyName() {
		System.out.print("이");
	}
	
	public void name() {
		familyName();
		System.out.println("순신");
	}
}

class Duaghter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}

class Son extends Parents{
	public void name() {
		familyName();//자식이 가지고있는 패밀리 내임이 없기 때문에 부모가 가지고 있는 패밀리 네임이 그대로 출력된다
		System.out.println("기광");
	}
}
public class Ex02 {

	public static void main(String[] args) {
		/*
		Parents p = new Parents();
		p.name();
		Duaghter d = new Duaghter();
		d.name();
		Son s = new Son();
		s.name();
		*/
		
		//upcasting
		Parents p= new Parents();
		p.name();
		p = new Duaghter();
		p.name();
		p=new Son();
		p.name();

	}

}
