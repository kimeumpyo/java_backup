package class2;

public class Method3 {
	public static void main(String[] args) {
		// 객체화
		MyClass6 mc6 = new MyClass6();
		
		System.out.println(mc6.func(31, 49, 99));	// 자료형을 만든만큼 인자가 달라도 사용이 가능하다
		System.out.println(mc6.func(31, 49));
		System.out.println(mc6.func(31));
		System.out.println(mc6.func(3.14));			// 3
	}
}

class MyClass6{
	// 클래스 안에는 변수와 메서드만 올 수 있고
	int num;
	String str;
	
	int func() {
		// 메서드 안에는 코드를 쓸 수 있다
		return 0;
	}
	
	// 메서드 오버로딩 : () 안에 내용이 달라지면 다른 메서드로 취급해줄 수 있다. (C언어에서는 X)
	int func(int num1) {
		return num1;
	}
	
	int func(int num1, int num2) {
		return num1+num2;
	}
	
	int func(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	int func(double dnum) {
		System.out.println("실수는 정수로 변경됩니다");
		return (int)dnum;
	}
}
