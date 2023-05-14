package condition;

public class If_else1 {
	public static void main(String[] args) {
		// if(){} : ()조건이 맞으면 {}실행
		// 조건이 틀려도 실행할 부분을 구분해놓고 싶다
		// 조건이 맞을때 실행할 코드와 조건이 틀릴때 실행할 코드를 마련
		// else{}
		if(false) {
			System.out.println("조건이 맞을떄 실행할 코드");
		}else {
			System.out.println("조건이 틀릴때 실행할 코드");
		}
		
		// if()조건이 틀렸을 때 그 다음 조건을 검사하고 싶으면 
		if (99 < 10) {
			// else if(){}: 위 조건이 틀렸을 경우에만 검사할 조건
			System.out.println("10보다 작습니다.");
		}else if(99 < 100) {
			System.out.println("100보다 작습니다");
		}else if(99 < 1000) {
			System.out.println("1000보다 작습니다");
		}else {
			System.out.println("그 밖에");
		}
		
		
		
		
		
		
		
	}
}
