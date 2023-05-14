package review;

public class _07_Extends {
	public static void main(String[] args) {
		MyExtends me = new MyExtends();
		me.setStr("123");
		String str = me.getStr();
		System.out.println(str);
	}
}

// 상속 (extends) : MyClass7을 MyExtends에 복붙
class MyExtends extends MyClass7{
	// 여기서 MyClass7변수와 메서드를 사용 가능
	
	// 오버라이딩(재정의) : "상속 후" 조금 바꿔야할 메서드가 있다
	public String getStr() {
		return "=="+super.getStr()+"==";
		// super. : 부모의
	}
}

class MyClass7 {
	// 클래스 : 변수 + 함수
	private String str;

	// 생성자 (클래스의 이름과 동일한 이름의 메서드, 객체화할 때 자동 호출) 자료형 x
	public MyClass7(/* 클래스명 this 가 숨어있다*/) {

	}

	// 메서드는 ()를 갖고있다
	public void setStr(String str) {
		this.str = str; // 매개변수 () str을 멤버변수 str에 담는다 (this.매개변수 = 멤버변수);
		
		// 함수 -> 메서드로 바뀔 때 매개변수로 삽입
		// this : 내 클래스의 멤버(변수 또는 메서드)
	}

	public String getStr(/* 클래스명 this 가 숨어있다*/) {
		return str;		// 곂치는 명칭이 없으면 this. 생략 가능
	}
	
	// 오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드 취급
	public String getStr(String str) {
		return this.str + str;
	}

}
