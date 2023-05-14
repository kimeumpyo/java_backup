package extend;

// Impl : 구현부
public class PhoneImpl {
	public static void main(String[] args) {
		// 인터페이스를 상속받은 클래스는 자료형을 인터페이스명으로 함
		Phone2G p1 = new Phone2G();
		p1.call(); p1.msg();
		
		Phone3G p2 = new Phone3G();
		p2.internet();
		
		PhoneLTE p3 = new PhoneLTE();
		p3.LTE();
		
		Phone5G p4 = new Phone5G();
		p4.bigData();
		
		
		
		
	}
}

class Phone2G implements Phone{
	// 전화 + 문자

	@Override
	public void call() {
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		System.out.println("문자를 보냅니다.");
	}
}

class Phone3G implements Phone{
	// 전화 + 문자 + 인터넷
	
	@Override
	public void call() {
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		System.out.println("문자를 보냅니다.");
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
}

class PhoneLTE extends Phone3G{
	// 전화 + 문자 + 인터넷 + 속도(빠름)

	public void LTE() {
		System.out.println("속도가 빠릅니다.");
	}
	
}

class Phone5G extends PhoneLTE{
	// 전화 + 문자 + 인터넷 + 속도(빠름) + 빅데이터

	public void bigData() {
		System.out.println("데이터가 큽니다.");
	}
}
