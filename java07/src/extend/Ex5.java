package extend;

public class Ex5 {
	public static void main(String[] args) {
		MyStr ms = new MyStr("하하호호");
		ms.setStr("키키크크");
		ms.printStr();
		
		MyStrEx mse = new MyStrEx("바바부부");
		mse.printStr();
	}
}

class MyStr{
	// 멤버변수
	protected String str;
	protected String str1;
	// 생성자
	public MyStr(String str) {
		this.str = str;
	}

	public void setStr(String str1) {
		this.str1 = str1;
	}
	
	public String getStr() {
		return str1;
	}

	public void printStr() {
		System.out.println(str+" "+str1);
	}
}


// MyStr 클래스를 상속받고 출력이 좀더 꾸며진채로 출력될 수 있게 변경

class MyStrEx extends MyStr{
	public MyStrEx(String str) {
		super(str);		// 부모 생성자에 매개변수가 있으면(기본 생성자가 없으면) 자식 생성자에서 사용을 해줘야함
	}
	public void printStr() {
		System.out.println("== "+str+" ==");
	}
}


	

	

	






