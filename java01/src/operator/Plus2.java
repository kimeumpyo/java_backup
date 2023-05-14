package operator;

public class Plus2 {
	public static void main(String[] args) {
		// 숫자를 더하기
		// 1+1
		System.out.println(1 + 1);
		
		int 숫자1 = 1;
		int 숫자2 = 2;
		// 더하기
		System.out.println(숫자1 + 숫자2);
		
		// 빼기
		System.out.println(숫자1 - 숫자2); 
		
		// 곱하기
		System.out.println(숫자1 * 숫자2);
		
		// 나누기
		System.out.println(숫자2 / 숫자1);
		
		// 나머지구하기
		System.out.println(숫자1 % 숫자2);
		
		int 숫자3 = 숫자1 * 숫자2;
		System.out.println("곱하기 결과는 :"+ 숫자3);
		
		// 연산자에는 우선순위가 있다
	}
}
