package review;

public class _01_Var {
	public static void main(String[] args) {
		// 자바1 : 자바의 기본 문법 (언어기본문법 + 객체지향기법)
		// 자바2 : 자바에서 제공되는 클래스에 대해서
		
		/*
		 1일 : 변수와 자료형
		 2일 : 연산자
		 3일 : 조건문
		 4일 : 반복문 (+break, continue)
		 5일 : 배열, 함수
		 6일 : 클래스와 메서드 (객체지향)
		 7일 : 상속
		 8일 : 인터페이스와 다형성
		 
		 9일~15일 : 자바에서 제공되는 클래스 (예외처리, 문자열, 랜덤, 시간, 컬렉션, 쓰레드, 스트림, 데이터베이스 ...)
		*/
		
		// 변수와 자료형
		// 변수 : 저장공간
		// 자료형 : 데이터의 형태(type => int, double, String, boolean, ...)
		
		// 변수 선언
		int num;
		
		// 변수 초기화 (초기값 대입)
		double dnum = 3.14;
		
		// 변수 대입 (값을 변경)
		dnum = 10.5;
		
		// 자료형 변환
		num = (int)dnum;		// 10.5 -> 10
		
		// 출력 syso (ctrl + space)
		System.out.println(num + dnum);
	}
}
