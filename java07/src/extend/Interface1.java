package extend;

public interface Interface1 {
	// interface
	// 인터페이스 : static 상수 + 추상메서드
	// 인터페이스는 상속 전용, 다형성, 명세서 개념
	
	// 상수 : 초기화할 때 값을 정해놓으면 변셩이 불가능한 변수
	final static int num = 0;
	
	final String str = "hello";
	
//	str = "hi";		// final 상수는 한번 값을 정하면 바꿀 수 없다
	
	// 추상메서드 : ()까지만 적는다. {}는 적지 않는다.
	public void func();		// 함수 선언 (정의x)
	
	// 상속받는 곳에서 이 기능을 정할거야.
	// 반드시 만들어야할 메서드를 안내(명세서)
}

// 인터페이스를 상속(지정)받으려면 extends -> implements
class Test implements Interface1{
	// 인터페이스를 지정하는 순간 클래스명에 오류가 발생
	// 마우스를 갖다대고 'Add unimplemented methods' 를 클릭
	// 메서드 완성

	@Override
	public void func() {
		// 반드시 만들어야한다! (필수사항)
		
		
	}
	
}
