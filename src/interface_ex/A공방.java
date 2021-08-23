package interface_ex;

public interface A공방 {//추상화 메소드를 쓰는것을 인터페이스
	
	//인터페이스에는 추상화코드를 써야한다. 실체화가 없는 코드.
	public void attack(); //이걸 상속받아 쓰자
	public void defense();
	
	//이렇게 abstract써도 돼고 안써도됌, 굳이 안써도 돼는게 자동으로 있기 때문에 안써도됌
	//public abstract void attack();
	
	
	
	//인터페이스에는 실체화가 있는 코드는 오류가난다
	/*
	public void test() {
		System.out.println("test");
	}
	*/

}
