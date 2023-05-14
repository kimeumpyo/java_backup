package _thread;

import java.util.Scanner;

public class MyThread2 {
	public static void main(String[] args) {
		// 컴퓨터 전원을 on
		// 운영체제 프로그램 실행
		
		// 프로그램 : 코드로 작성된 작업지시서 (이클립스, 크롬, 게임)
		// 프로세스 : 실행중인 프로그램 (프로그램을 프로세스에 등록했다)
		// 쓰레드 : 프로세스 안에서 실질적으로 코드를 한줄씩 실행하는 단위 (작업을 수행하는 노동자)
		
		// main함수 안에는 기본적으로 주쓰레드(main쓰레드)가 있어 main함수부터 실행할 수 있음
		// 동시에 실행하고자하는 기능이 있다면 한명의 노동자로는 부족
		// ==> 쓰레드 추가 생성
		
		// 자바에서 쓰레드를 생성하는 방법(2) : 1. Thread 상속받은 클래스 2. Runnable 인터페이스 지정받은 클래스
		// 추가쓰레드에서 동작정의 : run() 메서드
		// 추가쓰레드 사용 : start() 메서드
		
		// 추가 쓰레드 생성(객체화) ==> 멀티쓰레드 프로그램
		MyInput input = new MyInput();
		input.start();		// start() 메서드를 통해서run() 메서드를 추가쓰레드가 실행
		
		// 배경음 재생하면서 키보드 입력을 받기 (동시에)
		for(int i=0; i<100; i++) {
			System.out.println("배경음 재생 중 ~~");
			try {
				// sleep(1000) : 1000ms(1초)동안 해당 쓰레드를 멈춤
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 쓰레드 추가 생성을 위해선 쓰레드를 상속받은 클래스가 필요
class MyInput extends Thread{
	// 멤버변수
	private Scanner sc;
	private String str;
	
	public MyInput() {
		sc = new Scanner(System.in);
	}
	
	// 쓰레드는 run() 메서드를 통해서 구현
	public void run() {
		// 동시에 실행하고 싶은 작업을 구현 (추가 노동자가 동시에 수행할 작업)
		for(int i=0; i<10; i++) {
			keyboard();
		}
	}
	public void keyboard() {
		System.out.println("입력>>");
		str = sc.nextLine();
		System.out.println("나의 입력 내용: " + str);
	}
}
