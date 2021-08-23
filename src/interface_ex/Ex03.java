package interface_ex;

interface Test{
	//public int a;이러면 에러
	
	//무조건 static final을 써줘야함
	public static final int a =12345; //final이라 미리 값을 지정해줘야헌다ㅓ
	public final int a1 =12345; //final이라 미리 값을 지정해줘야헌다ㅓ
	public static int a2 =12345; 
	public static final String id = "홍길동";
	public static final String pwd = "12345";
	
}

public class Ex03 implements Test{
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pwd); //상속받아서(implements) 바로 쓸수도있다
	}

}
