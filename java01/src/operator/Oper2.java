package operator;

public class Oper2 {
	public static void main(String[] args) {
		int 국어 = 49;
		int 영어 = 40;
		int 수학 = 60;
		int 합계 = 국어 + 영어 + 수학;
		// 합계와 평균을 구하세요
		/*
		 	합계 : 000점
		 	평균 : 000점
		 */
		System.out.println("총점수:"+합계+"점");
		
		// double을 추가해주거나 나누는 숫자에 소수점을 넣어준다
		System.out.println("평균:"+((double)합계/3.0)+"점"); 
		System.out.printf("평균:%.2f점",합계/3.0); 
	}
}
