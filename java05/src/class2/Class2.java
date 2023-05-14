package class2;

public class Class2 {
	public static void main(String[] args) {
		// 객체화할떄는 구체적으로 누구인지 명시
		// 사람은 사람인데 '이순신'
		Person 이순신 = new Person();
		Person 아빠 = new Person();
		Person 엄마 = new Person();
		Person 나 = new Person();		// 객체화를 할 때는 추상적인 클래스를 구체적으로 명시
		
		// 클래스(class) : 대상X(설계도)
		// 객체(Object) : 대상을 정한다
		이순신.이름 = "이순신";
		이순신.나이 = 36;
		이순신.키 = 188.8;
		// 이순신이라는 객체는 이순신, 36, 188.8 이라는 정보를 갖고있음
		이순신.말하기();		// Person에서 말하기 메서드
		
		나.이름 = "홍길동";		// 문자열(String)
		나.나이 = 20;			// 정수(int)
		나.키 = 177.1;		// 실수(double)
		// 나라는 객체는 홀길동, 20, 177.1 이라는 정보를 갖고있음
		나.말하기();			// Person에서 말하기 메서드
		
		// ==> 메서드를 사용했을 때 활용되는 정보가 다르다는 뜻
		
		
	}
}

// 클래스는 포괄적인 개념 ==> 객체는 구체적인 물체
class Person{
	// '사람' 클래스
	
	// 변수 == 정보 (사람이라면 작조 있어야하는 정보)
	String 이름;
	int 나이;
	double 키;		// 변수는 클래스의 정보들을 저장하기 위해 생성
	
	// 메서드 == 행위 (사람이 항 수 있는 행위)
	void 말하기() {
		System.out.println(이름+"(이)가 말합니다.");
	}
	void 걷기() {
		int 거리 = 3;
		System.out.println(이름+"은 "+거리+"km 만큼 걷습니다.");
	}
}