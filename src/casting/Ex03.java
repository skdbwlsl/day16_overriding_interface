package casting;

import java.util.ArrayList;

class AAA{
	public String getText() {return "AAA클래스";}
}

public class Ex03 {
	public static void main(String[] args) {
		//AAA a = new AAA();
		
		//upcasting
		Object a = new AAA(); //부모 클래스도 어쨌든 조상은 object라 이렇게 쓸수있다
		
		//downcasting(위처럼 업캐스팅하면 자식이 자식기능쓰고싶을때 쓸수 없기 때문에 다운캐스팅을 하는데 대신에 형변환을 해야한다
		AAA aa = (AAA)a; //부모형태를(a) 자식형태로(aa) 형변환한다
		aa.getText();
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		String s = (String)arr.get(0);

	}

}
