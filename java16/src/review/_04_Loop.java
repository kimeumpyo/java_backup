package review;

public class _04_Loop {
	public static void main(String[] args) {
		// 반복문
		// while, for, do~while
		
		// while문
			int 초기값 = 0;
			
			// 4번 반복하고 싶다
			while(초기값 < 4) {
				System.out.println("반복할 문장 "+초기값+"번째");
				초기값++;
				if(초기값 == 2) {
					break;	// 반복문 종료
				}
			}
		
		// for문
			for(int i=0; i<4; i++) {
				if(i==2) {
					continue;		// 밑에 문장 무시하고 위로 올라감 (1회성 취소)
				}
				System.out.println("반복할 문장 "+초기값+"번째");
			}
		
	}
}
