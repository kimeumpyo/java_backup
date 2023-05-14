package multiThreading;

public class Sync1 {
	public static void main(String[] args) {
		// 멀티쓰레드 환경에서
		// '동기화' synchronized
		// 해당 클래스를 동기화해서 여러 쓰레드가 동시에 접근하는 것을 방지한다
		Toilet toilet = new Toilet(); 				// 화장실 (동기화된 클래스)
		Thread 아이유 = new Thread(toilet, "아이유"); 	// 사람1
		Thread 전현무 = new Thread(toilet, "전현무"); 	// 사람2

		아이유.start();
//		try {
//			아이유.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		전현무.start();
	}
}

// 1인용 화장실... 한명이 사용하고 있으면 다른 사람은 대기해야한다...
class Toilet implements Runnable {
	private int time; // 10초동안 사용 (동시에 사용은 불가능)

	public void run() {
		synchronized (this) { // 이 클래스는 동기화 시킬거다

			String name = Thread.currentThread().getName(); // 쓰레드 이름 받기
			System.out.println(name + " 화장실 들어감");
			for (time = 1; time <= 10; ++time) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(name + " 화장실 사용 중..." + time + "초");
			}
			System.out.println(name + " 화장실 나옴");
		} // synchronized(this)
	} // run()
} // Toilet{}
