package review;

public class _05_Array {
	public static void main(String[] args) {
		// 배열 : 같은 주제의 변수들을 하나로 묶기위해
		int num1 = 1, num2 = 2, num3 = 3;
		
		int num[] = {1,2,3};
		
		// 주의! 3개를 저장하는 배열을 만들면 2번까지만 있다
		int nums[] = new int[10]; // 0~9번방
		for(int i=0; i<=9; i++) {	// 10개를 만들면 9번방까지만 있다 (0번부터 시작하기때문!)
			nums[i] = 0;
		}
	}
}
