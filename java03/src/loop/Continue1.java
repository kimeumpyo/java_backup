package loop;

public class Continue1 {
	public static void main(String[] args) {
		// continue : 반복문의 시작점으로 돌아감, ()로 돌아감, 밑에 코드를 무시하고 위로 올라감
		
		int i = 0;
		while(i < 10) {
			i++;
			if(i % 2 == 1) {
				continue;		// 실행되면 밑 부분을 무시하고 위 ()로 올라가는 문법(반복문 처은으로 이동)
			}
			System.out.println("while:"+i);
		}
		// while의 continue : 무조건 ()로 이동
		
		for(int j=0;j<10;j++) {
			if(j % 2 == 1) {
				continue;
			}
			System.out.println("for: "+j);
		}
		// for continue : ()로 이동해서 증감량부터 먼저 계산하고 조건식을 검사
	}
}
