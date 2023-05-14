package review;

public class Review {
	// 프로그램을 실행시키려면 main() 이 있어야한다
	public static void main(String[] args) {
		// 클래스를 사용하기 위해선 '객체화' 라는 작업을 해야한다
		// 클래스명 변수명 = new 클래스명();
		MyClass2 m = new MyClass2();
		MyClass2 m2 = new MyClass2();		// m != m2 (싱글턴패턴이 아니면 서로 다른 존재)
		
		m.setNum(33);
		
		// return 값은 변수로 받는다
		int num = m.getNum();
		if (num > 0) {
			System.out.println("양수입니다 :"+num);
		}else {
			System.out.println("음수입니다 :"+num);
		}
		System.out.println(num);
	}
}
class MyClass2 extends MyClass{
	// extends(상속) : MyClass를 MyClass2에 복붙
}

// 클래스(변수+함수)
class MyClass{
	// 변수 (=>멤버변수 private)
	private int num;		// 정수
	private String str;		// 문자열
	private double dnum;	// 실수
	private int numbers[] = new int[30];	// 정수 공간 30개 묶어놓음(=>배열 0~29)
	
	// 함수 (=>메서드 public)
	void setNum(int num)		// () : 사용할 때 정해질 값을 받아올 변수(=>매개변수) 
	{
		this.num = num;			// 멤버변수 num에다가 매개변수 num의 값을 대입
		
		String str ="";			// 지역변수 (함수가 끝나면 사라짐)
	}
	
	int getNum() {
		return num;				// return은 함수 실행 후 사용한 곳에 알려줄 값(함수의 자료형을 결정)
	}
	
	// 생성자(이름이 클래스명과 같은 메서드, 객체화할 때 사용됨)
	MyClass(){
		num = 0;
		str = null;
		dnum = 0.0;
		
		for(int i=0; i<numbers.length; ++i) {
			numbers[i] = 0;			// 0 ~ 29번방 모두 0으로 대입	
		}
	}
}