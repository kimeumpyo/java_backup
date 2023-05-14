package condition;

import java.util.Scanner;

public class If_else3 {
	public static void main(String[] args) {
		// 1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		
		// 2. 학점 계산(90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		
		// 3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 '비밀번호가 맞습니다.'
		// 틀리면 '비밀번호가 다릅니다.'
		
		// 4. 윤년 판별하기
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		System.out.print("나이를 입력하세요>>");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.println("성인 입니다.");
		}else if(age >= 14){
			System.out.println("청소년 입니다.");
		}else{
			System.out.println("어린이 입니다.");
		}
		
		System.out.println("===========================");
		
		int score = 0;
		System.out.print("점수를 입력하세요>>");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점");
		}else if (score >= 80) {
			System.out.println("B학점");
		}else if (score >= 80) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		System.out.println("===========================");
		
		int pw = 0;
		int pwkey = 0001;
		System.out.print("비밀번호를 입력하세요>>");
		pw = sc.nextInt();
		
		if (pw == pwkey) {
			System.out.println("비밀번호가 맞습니다.");
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
		System.out.println("===========================");
		
		System.out.print("년도를 입력하세요>>");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년 입니다.");
		}else {
			System.out.println("윤년이 아닙니다");
		}
		
	}
}
