package interface_ex;

import java.util.Scanner;


//interface�� implements�� ���� ����� �޴´�.
class B���� implements A����{
	public void �Ѿ˱���() {
		System.out.println("�Ѿ��� ���� �մϴ�");
	}

	@Override
	public void attack() {
		�Ѿ˱���();
		System.out.println("������ ���� �մϴ�");
	}
	
	public void ��������() {
		System.out.println("���и� �����մϴ�");
	}

	@Override
	public void defense() {//�׳��ϸ� �������⶧���� ������ �������̵� �ؾ��Ѵ�
		��������();
		System.out.println("������ ��� �մϴ�");
		
	}
}

class B���� implements A����{

	@Override
	public void attack() {
		System.out.println("������ ���� �մϴ�");
		
	}

	@Override
	public void defense() {
		System.out.println("������ ��� �մϴ�");
		
	}
}

public class Ex02 {
	public static void main(String[] args) {
		B���� ���� = new B����();
		B���� ���� = new B����();
	
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		int choice = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num==1)System.out.println("���� ����");
		else System.out.println("���� ����");
		
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		
		if(choice == 1 && num==1) ����.attack(); //�������̽� �ʿ��� ������ ������attack, ���� ������ defense�̴� �����ؼ� ���°�, �̸��� �����ؼ� ���ٰ� ��������
		else if(choice ==2 & num==1) ����.defense();
		if(choice==2 && num==2) ����.attack();
		else if(choice==2 && num==2) ����.defense();
		
		
		//���κκ��� upcasting���� �ٲ㺸��
		/*
		A���� ���� = null;
		if(num==1) {
			System.out.println("���� ����");
			���� = new B����();
		}
		else {
			System.out.println("���� ����");
			���� = new B����();
		}
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		if(choice==1) ����.attack();
		else ����.defense();
		*/
		
	}
}
