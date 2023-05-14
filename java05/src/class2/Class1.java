package class2;

public class Class1 {
	public static void main(String[] args) {
		// 클래스와 메서드 (코딩 방법론)
		// 객체지향 OOP
		
		// C언어에는 '구조체'라는 문법이 있었음
		// 구조체는 변수들을 뭉쳐놓는 문법
		// 포인터 개념을 가리기 위해서 구조체에 함수를 넣고 이름을 바꾼것이 '클래스'
		
		// 클래스 : '변수'와 '함수' 담아놓는 공간 (class : 변수 + 함수) 
		
		// 클래스를 다른 클래스에서 사용하기 위해서는 '객체화'라는 작업을 거쳐야함
		
		// 객체화 하는 방법
		// 클래스명 객체명 = new 클래스명();
		
		// Class1에서 MyClass1을 사용하고 싶다 ==> MyClass1을 '객체화' 해줘야한다
		MyClass1 변수명1 = new MyClass1();
		
		// 변수명1 이라는 이름으로 '객체화' (클래스를 통해서 객체 생성)
		// 객체(변수명1)를 통해서 클래스(MyClass1)의 변수와 메서드를 사용할 수 있다.
		변수명1.메서드명();
		변수명1.num = 3;
		System.out.println(변수명1.num);		// 사용할 때는 객체명. 으로 사용
	}
}

class MyClass1{
	// 클래스 : 변수 + 함수
	// 변수
	int num;
	String str;
	
	// 메서드(클래스 안에 있는 함수는 메서드 라고 부릅니다)
	
	void 메서드명() {
		System.out.println("자료형이 없는 메서드");
	}
	
	int 정수형_메서드명() {
		System.out.println("메서드를 사용했다!");
		return 0;
	}
	
	String 문자열형_메서드명() {
		System.out.println("문자열형 메서드를 사용했다!");
		return "";
	}
}