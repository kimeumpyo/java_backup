package random;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	public static void main(String[] args) throws InterruptedException {
		// 자바에서 랜덤을 사용하는 법
		// Math클래스 또는  Random클래스 사용
		MyRandom md = new MyRandom();
		md.go1();
		md.go2();
		md.go3();
		md.go4();
		
		
		MyRand mr = MyRand.getInstance();
		System.out.println(mr.go());
		
		
		
	}
}
class MyRandom{
	// nextInt : 0~0.999..까지 랜덤
	public void go1() {
		// 0 ~ 9 랜덤
		Random random = new Random();
		int result = random.nextInt(10);  	// 0 ~ 9 가지 랜덤 (0*10 ~ 0.9999*10)
		System.out.println(result);
	}
	public void go2() {
		// 100 ~ 105 가지 랜덤
		Random random = new Random();
		int result = random.nextInt(6)+100;
		System.out.println(result);
	}
	public void go3() {
		// 1 ~ 10 가지 랜덤
		Random random = new Random();
		int result = random.nextInt(10)+1;
		System.out.println(result);
	}
	
	// Math 클래스를 사용해서 랜덤
	public void go4() {
		int result = (int)(Math.random() * 10)+1; 	// 1 ~10
		System.out.println(result);
	}
}

// 싱글턴 패턴 클래스로 생성하여 사용자에게 숫자 2개를 입력받아 그 사이에서 랜덤을 돌려 리턴해주는 메서드
class MyRand{
	// 생성자를 막고
	private MyRand() {}
	
	// 객체
	private static MyRand instance;
	
	// 객체화를 진행할 메서드
	public static MyRand getInstance() {
		if(instance == null) {
			instance = new MyRand();
		}
		return instance;
	}
	// 멤버변수, 메서드
	public int go() {
		
		// 숫자 2개 입력받고(Scanner)
		Scanner sc = new Scanner(System.in);
		System.out.println("num1의 숫자을 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("num2의 숫자을 입력하세요");
		int num2 = sc.nextInt();
		// 첫번째 숫자가 더 크면 교체하고(swap)
		int swap = 0;
		
		if(num1 > num2) {
			swap = num1;
			num1 = num2;
			num2 = swap;
		}
		// 랜덤 돌리기(Random)
		Random random = new Random();
		int result = random.nextInt(num2-num1+1)+num1;  	// 0 ~ 9 가지 랜덤 (0*10 ~ 0.9999*10)
		
		// 정리작업
		sc.close();
		return result;
	}
	
}