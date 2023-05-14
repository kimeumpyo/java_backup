package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 1~10 중 짝수만 출력하기

		int i = 1;

		while (i <= 10) {
			if (i % 2 != 1) {
				System.out.println(i);
			}
				i++;
		}
		System.out.println("끝");
		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 정수, 맞추면 맞췄다!, 기회를 모두 사용하면 접속불가.)

		Scanner sc = new Scanner(System.in);

		int j = 0;
		int lock = 1234;
		int num = 0;

		while (j < 5) {
			System.out.println("정수를 입력해주세요>>");
			num = sc.nextInt();
			j++;
			if (num == lock) {
				System.out.println("암호를 맞추셨습니다");
				break;
			}
			if (j == 4) {
				System.out.println("접속불가");
				break;
			}
		}

	}
}
