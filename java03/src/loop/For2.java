package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해서 구현해보세요
		
		// 1.안녕 5번
		
		// 2. 1~10까지 합계 구하기
		
		// 3. 1~입력값까지 합계 구하기
		// (예시: 10 = 55)
		// (예시: 50 = 1275)
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕"+i);
		}
		
		//////////////////////////////////////
		
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println("총 합은"+sum);
		
		//////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요>>");
		int num = sc.nextInt();
		int sum2 = 0;
		
		for (int k = 1; k <= num; k++) {
			sum2 += k;
		}
		System.out.println("1 ~ "+num+"까지의 합은 "+sum2);
	}
}
