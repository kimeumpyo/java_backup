package control;

public class If_for {
	public static void main(String[] args) {
		// 조건문 안에 반복문 사용
		int flag = 1;
		
		// 조건문 안에 반복문 : 조건이 맞으면 반복문을 수행
		if(flag != 0) {
			for(int i = 0; i < 5; ++i) {
				System.out.println("조건문 안에 반복문:" +i);
			}
		}
	}
}
