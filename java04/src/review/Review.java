package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 1~10 중 짝수만 출력하기
		// for(초기값; 조건식; 증감량) {반복할 코드;}
		
		for (int i =1; i<= 10; ++i) {
			if (i % 2 == 0) {
			System.out.println(i);
			}
		}
		
		
		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 정수, 맞추면 맞췄다!, 기회를 모두 사용하면 접속불가.)
//		int pwd = 1234;
//		int user_input = 0;
//		
//		for (int i=0; i<5; i++) {
//			System.out.println("비밀번호를 입력하세요>>");
//			user_input = sc.nextInt();
//			if(user_input == pwd) {
//				System.out.println("맞았습니다!");
//				break;
//			}
//			if(i == 4) {
//				System.out.println("접속불가");
//			}
//		}
		
		// 3. 시험합격 점수는 국어, 영어, 수학이 각각 40점 이상이고, 총 점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되었으면 총점미달
		
		int k = 40;
		int e = 40;
		int m = 100;
		int sum = k + e + m;
			
			if (k >= 40 && e >= 40 && m >= 40) {
				if(sum > 150) {
					System.out.println("합격입니다");
				}else {
					System.out.println("총점미달입니다");
				}
			}else {
				System.out.println("과락입니다");
			}
			
		// 4. 1~10까지의 합 구하기(반복문)
			
		int i = 1;
		int sum1 = 0;
		
		while (i <= 10) {
			sum1 += i;
			i++;
		}System.out.println(sum1);
		
		// 5. 10~1 까지 거꾸로 출력하기 (반복문)
		
		int j = 10;
		
		while (j >= 1) {
			System.out.print(j+" ");
			j--;
		}
				
			
	
		
		
		
	}
}
