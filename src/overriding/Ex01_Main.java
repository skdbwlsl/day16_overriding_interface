package overriding;

public class Ex01_Main {
	public static void main(String[] args) {
		/*
		 overriding
		 - ��ӹ��� �ڽ��� �޼ҵ��� ������ ����(������Ʈ)�ϴ� ��
		 
		 ����
		 - �θ� �޼ҵ��� ���İ� �����ϰ� �ڽ� �޼ҵ带 ����� ��
		 	1) ��ȯŸ���� ���ƾ��Ѵ�
		 	2) �Ű������� ������ Ÿ���� ���ƾ� �Ѵ�
		 	3) ���� �����ڰ� �θ�� ���ų� Ŀ�� �Ѵ�
		 	- private < package < protected < public
		 */
		
	//	Ferrari fe = new Ferrari(2021, 350);
	//	fe.speed();
		NewFerrari fe = new NewFerrari(2022, 400);  //�̰� ��Ӱ���
		fe.speed(); fe.autoSystem();
		
		

	}

}
