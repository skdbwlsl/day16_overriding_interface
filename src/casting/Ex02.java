package casting;

class Parents{
	public void familyName() {
		System.out.print("��");
	}
	
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Duaghter extends Parents{
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Son extends Parents{
	public void name() {
		familyName();//�ڽ��� �������ִ� �йи� ������ ���� ������ �θ� ������ �ִ� �йи� ������ �״�� ��µȴ�
		System.out.println("�Ɽ");
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
