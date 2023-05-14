package review;

public class For3 {
	public static void main(String[] args) {
		// for(초기값; 조건식; 누적연산){반복대상코드;}
		
		for(int i=0;i<20;i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// for문의 초기값을 바깥에서 만들 수 있다 (while처럼)
		int j = 0;
		
		// 변수를 for바깥에서 만들면 for문이 종료되도 변수는 유지가 됨
		// for문 안에서 초기값(변수)를 만들면 for문이 종료되면 변수도 없어짐
		for(j=1;j<=10; j++) {
			System.out.print(j+" ");
		}
		System.out.println("for문끝: "+j);		// for문 바깥에서 변수를 만들었기 때문에 공간이 유지됨
		
		// for문 ()의 초기값; 조건식; 증감량은 비워둘 수 있음
		// for문의 무한반복
		for(;;) {		// for문의 무한반복 형태
			System.out.println("무한반복");
			break;
		}
		
		for(;j<20;) {
			System.out.print(j+" ");
			j+=2;
		}
	}
}
