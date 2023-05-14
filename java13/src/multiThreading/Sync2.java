package multiThreading;

import java.util.Random;

public class Sync2 {
	public static void main(String[] args) {
		// 사람 3명(Thread 3개)
		DressRoom dr = new DressRoom();
		Thread 에이유 = new Thread(dr, "에이유");
		Thread 비이유 = new Thread(dr, "비이유");
		Thread 씨이유 = new Thread(dr, "씨이유");

		에이유.start();
		비이유.start();
		씨이유.start();
	}
}

// 의상탈의실
// 의류가게에서는 한 사람이 옷을 갈아입으러 탈의실에 들어가면 나올때까지 밖에서 대기를 해줘야한다
class DressRoom implements Runnable {
	
	public void run() {
		synchronized (this) { // 이미 사용중이면 다른 애들은 대기
			Random random = new Random();
			int room = random.nextInt(10);
			
			String name = Thread.currentThread().getName(); // 쓰레드 이름 받기
			System.out.println(name + " 탈의실 들어감");
			for (int i=1; i<=room; ++i) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + " 탈의실 사용 중..." + i + "초");
			}
			System.out.println(name + " 탈의실 나옴");
		}
	}
}