package interface_ex;

interface Test{
	//public int a;�̷��� ����
	
	//������ static final�� �������
	public static final int a =12345; //final�̶� �̸� ���� �����������٤�
	public final int a1 =12345; //final�̶� �̸� ���� �����������٤�
	public static int a2 =12345; 
	public static final String id = "ȫ�浿";
	public static final String pwd = "12345";
	
}

public class Ex03 implements Test{
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pwd); //��ӹ޾Ƽ�(implements) �ٷ� �������ִ�
	}

}
