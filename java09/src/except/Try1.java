package except;

import java.util.Scanner;

public class Try1 {
	public static void main(String[] args) {
		// 예외처리 : 사용자가 정상적인 방법으로 프로그램을 사용하지 않았을 경우에 대한 대비
		// 0으로 나누기, 숫자를 입력하라고 했는데 글자를 입력한다든지, 0~4를 입력하라고했는데 -1을 입력한다든지... 등
		
		// 사용자 입력을 받아 divide 메서드를 사용
		Scanner sc = new Scanner(System.in);
		
		MyClass5 mc5 = new MyClass5();
		
		while(true) {
			System.out.println("num1의 숫자을 입력하세요");
			int num1 = sc.nextInt();
			System.out.println("num2의 숫자을 입력하세요");
			int num2 = sc.nextInt();	
			
			// 예외처리 : num2가 0일때는 나누기를 안하는 방법으로 예외처리
//			if(num2 != 0) {
//				mc5.divide(num1, num2);			// 입력받은 숫자 2개를 나누기해서 결과를 보여줌
//			}else {
//				System.out.println("0으로는 나눌 수 없습니다.");
//			}
			
			// 모든 경우에 대해 예외처리를 해줄 수 없기 때문에 try~catch 라는 것을 제공
			try {
				// 시도할 코드
				mc5.divide(num1, num2);
			}catch(Exception e) {
				// 해당 코드에서 예외가 발생했을 경우
				System.out.println("나누기에 예외가 발생했습니다.");
			}
		}
		
		
	}
}

class MyClass5{
	// 나누기한 결과를 출력
	public void divide(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
