package control;

public class For_for {
	public static void main(String[] args) {
		// 반복문 안에 반복문을 사용할 수 있음
		// 한번 반복할 때마다 안쪽에 있는 반복문을 수행
		
		for(int i=0;i<2;i++) {
			System.out.println("==i"+i+"==");
			for(int j=0;j<3;j++) {
				System.out.println("i="+i+", j="+j);
			}
			System.out.println();		// 안쪽 for문이 끝나면 한줄 바꾸기
		}
		
	}
}
