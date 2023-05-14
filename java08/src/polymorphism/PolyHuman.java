package polymorphism;

public class PolyHuman {
	public static void main(String[] args) {
		// 다형성 : 부모 클래스의 자료형으로 자식 클래스를 생성할 수 있다
		// 자료형이 톨링되기 때문에 기능 추가에 대해서 코드 수정이 줄어듦 (유지보수, 업데이트)
		
		// 자료형을 인테페이스명으로 하고 생성자는 객체화하고자하는 클래스명을 적는다
		Human hong = new Hong();		// 다형성 적용
		Human gang = new Gang();
	}
}

class Hong implements Human{
	public void 운동하기() {
		System.out.println("홍씨가 운동합니다");
	}

	public void 공부하기() {
		System.out.println("홍씨가 공부합니다");
	}
}

class Gang implements Human{	
	public void 운동하기() {
		System.out.println("강씨가 운동합니다");
	}

	public void 공부하기() {
		System.out.println("강씨가 공부합니다");
	}
}