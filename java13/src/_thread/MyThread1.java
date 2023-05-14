package _thread;

import java.util.Scanner;

public class MyThread1 {
	public static void main(String[] args) {
		// 쓰레드 
		// main쓰레드 1개만 사용해왔다
		
		// '동시에 작업을 할 필요가 있을 때'
		// main쓰레드 혼자서는 윗줄부터 아래로 하나씩 실행 (동시 실행이 불가능)
		
		// 게임( 배경음과 채팅입력과 채팅메시지 출력이 동시에 이뤄짐)
		
		Scanner sc = new Scanner(System.in);
		
		// 10초 동안 배경음 + 채팅 + 출력 (동시 작업 필요)
		for(int i=0; i<10; i++) {
			System.out.println("배경음>>");		// 배경음 재생 하면서
			System.out.println("채팅입력>>");		
			String str = sc.nextLine();			// 채팅도 입력하면서
			System.out.println(str);
			System.out.println("상대방 채팅>>");	// 상대방이 입력하는 채팅도 보여야함
		}
		
		System.out.println("결론 : main쓰레드(주쓰레드) 하나만으로는 동시 작업이 불가능");
		
		// 쓰레드 추가 생성 필요
	}
}
