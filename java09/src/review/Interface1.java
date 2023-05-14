package review;

public interface Interface1 {
	// 상수 + 메서드껍데기
	void must1();				// 선언만 (만들어야할걸 표시!)
	void must2();
	abstract void must4();		// 사실은 이 형태
	
	int NUM = 0;				// 상수(변경이 불가능)
	final static int NUM2 = 2;	// 사실은 이 형태
}
