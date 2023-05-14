package multiThreading;

public class MyThread6 {
	public static void main(String[] args) {
		MyModel mm = new MyModel();
		Examples2 ex2 = new Examples2(mm);
		Examples1 ex1 = new Examples1(mm);
		Examples3 ex3 = new Examples3(mm);

		ex1.start();
		try {
			ex1.join(); // ex1의 실행을 보장
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ex2.start();
		try {
			ex2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ex3.start();

	}
}
// 쓰레드 3개를 만든 다음
// join을 통해서
// 첫번째의 쓰레드가 먼저 수행된 다음
// 나머지 쓰레드가 수행되게 해주세요

class Examples1 extends Thread {
	private MyModel mm;
	
	// 자료형에는 void 빼고!
	public Examples1(MyModel mm) {
		this.mm = mm;
	}

	public void run() {
		mm.list.add("안녕!");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Examples2 extends Thread {
	private MyModel mm;

	public Examples2(MyModel mm) {
		this.mm = mm;
	}

	public void run() {
		for (String str : mm.list) {
			System.out.println(str);
		}
	}
}

class Examples3 extends Thread {
	private MyModel mm;

	public Examples3(MyModel mm) {
		this.mm = mm;
	}

	public void run() {
		mm.list.set(0, "반갑!");
		System.out.println("쓰레드3");

		for (String str : mm.list) {
			System.out.println(str);
		}
	}
}
