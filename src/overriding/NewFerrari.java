package overriding;

public class NewFerrari extends Ferrari{
	public NewFerrari(int ye,int speed) {
		super(ye, speed); //받은 값을 부모에 넘겨준다 (private int ye, speed여기로 넘긴다)
	}
	public void autoSystem() {//새로운 기능 추가
		System.out.println("자동 운전 모드를 시작 합니다");
	}
	
	public void speed() {//부모 메소드 speed를 똑같이 만든다 오버라이딩으로 자식메소드에도 만들면 부모가 아닌 자기자신이 실행된다(부모의 값과 동일하게 만든다)
		System.out.println(getYe() + "년 페라리 속도 " +getSpeed() + "km 입니다");
		System.out.println("터보 엔진으로 동작합니다");
	}
	
	

}
