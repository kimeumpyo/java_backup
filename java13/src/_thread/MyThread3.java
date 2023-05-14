package _thread;

public class MyThread3 {
	public static void main(String[] args) {
		// 객체화 2개
		Example1 ex1 = new Example1();
		Example2 ex2 = new Example2();
		// start() 2개
		ex1.start();
		ex2.start();
	}
}

// 클래스 2개를 생성해서 쓰레드를 각각 상속받고 
// 반복문을 100번 돌려서 0.5초마다 동시에 출력
// 1. 쓰레드1
// 2. 쓰레드2

class Example1 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("1번 실행중");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Example2 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("2번 실행중");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

