package overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa(){
		System.out.println("������ ����Դϴ�");
	}
	
	/*
	//�������̵� ����
	public Object get(int modCount) {
		return super.get(modCount)+"���� ���� ���";
	}
	*/
	
	//�̰͵� �������̵� ����
	@Override
	public Object get(int i) {
		return "���� ���� get�̴�";
	}
	
	//�������̵�
	public boolean add(Object o) {
		System.out.println("�߰��ϴ� ��� �Դϴ�");
		return true;
	}
}

final class BB {//final�� ������ ����� ���Ѵ�. ������ ���ϵ��� ���°�
	public void bb() {
		System.out.println("bb�� ����Դϴ�");
	}
}
	class CC {
		BB b = new BB();
		public void bb() {
			b.bb();
			System.out.println("cc�� ����Դϴ�");
		}
	}
	

public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();
		
		//�� �������
		//ArrayList arr = new ArrayList();
		//String s;
		
		//�̰� �� ���ϴ�
		a.add("�ȳ��ϼ���");
		System.out.println("���尪 : " + a.get(0));
		
		

	}

}
