package abstract_ex;

abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num = num; //이런건 실체화가 돼있는 코드이다
	}
	
	//실체화가 없는 코드
	public abstract void combo(); //실직적 코드를 없애는게 추상화, 기본적인 틀만을 정의, 이건 무조건 오버라이딩해서 써라라는 뜻
	
}

class NewAbstract extends Abstract{ 
	//@Override -> 이건 안써도됌
	public void combo() {
		System.out.println(num + "단 콤보 공격 & 2대");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Abstract a = new NewAbstract();
		a.setNum(3);
		a.combo();
	
	}

}
