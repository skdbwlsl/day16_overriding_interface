package overriding;

public class NewFerrari extends Ferrari{
	public NewFerrari(int ye,int speed) {
		super(ye, speed); //���� ���� �θ� �Ѱ��ش� (private int ye, speed����� �ѱ��)
	}
	public void autoSystem() {//���ο� ��� �߰�
		System.out.println("�ڵ� ���� ��带 ���� �մϴ�");
	}
	
	public void speed() {//�θ� �޼ҵ� speed�� �Ȱ��� ����� �������̵����� �ڽĸ޼ҵ忡�� ����� �θ� �ƴ� �ڱ��ڽ��� ����ȴ�(�θ��� ���� �����ϰ� �����)
		System.out.println(getYe() + "�� ��� �ӵ� " +getSpeed() + "km �Դϴ�");
		System.out.println("�ͺ� �������� �����մϴ�");
	}
	
	

}
