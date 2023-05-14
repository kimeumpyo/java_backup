package operator;

public class Oper7 {
	public static void main(String[] args) {
		// 삼항연산자 (외부 조건에 따라서 실행할 코드를 구분)
		// 조건식 ? 맞으면 : 틀리며;
		int num = 3 > 2 ? 3 : 2;		// 3이 2보다 크니? 맞으면 3넣고, 틀리면 2넣어
		System.out.println(num); 
	}
}
