package casting;

import java.util.ArrayList;

class AAA{
	public String getText() {return "AAAŬ����";}
}

public class Ex03 {
	public static void main(String[] args) {
		//AAA a = new AAA();
		
		//upcasting
		Object a = new AAA(); //�θ� Ŭ������ ��·�� ������ object�� �̷��� �����ִ�
		
		//downcasting(��ó�� ��ĳ�����ϸ� �ڽ��� �ڽı�ɾ�������� ���� ���� ������ �ٿ�ĳ������ �ϴµ� ��ſ� ����ȯ�� �ؾ��Ѵ�
		AAA aa = (AAA)a; //�θ����¸�(a) �ڽ����·�(aa) ����ȯ�Ѵ�
		aa.getText();
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		String s = (String)arr.get(0);

	}

}
