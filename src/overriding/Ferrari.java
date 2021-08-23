package overriding;

public class Ferrari {
	private int ye,speed;
	public Ferrari(int ye, int speed) {
		this.ye = ye;
		this.speed = speed;
	}
	
	public void speed() {
		System.out.println(ye + "년 페라리 속도 " + speed+ "km입니다");
	}
	
	//private로 만들었기 때문에 꼭 get으로 가지고 와야한다
	public int getYe() {return ye;}
	public int getSpeed() {return speed;}
}