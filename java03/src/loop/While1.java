package loop;

public class While1 {
	public static void main(String[] args) {
		// 제어문 : 프로그램의 실행흐름을 변경하는 문법 (기본은 위에서 아래로, 왼쪽에서 오른쪽으로)
		// 조건문 : if, switch
		// 반복문 : while, for
		
		// while(){} 
		// while문 : if문과 유사하나 한가지 차이점이 있음
		
		// if(){} : ()의 조건이 맞으면 {}실행
		// while(){} : ()의 조건이 맞으면 {}실행하고 다시 () 조건을 검사하러 위로 올라감
		
		if(true) {		// 조건이 맞다 true
			System.out.println("if문 실행!");
		}
		while(true) {	// 조건이 맞다 true
			System.out.println("while문 실행!");
		}
	}
}
