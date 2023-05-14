package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		// # 1
		// try-catch를 사용해서 나누기를 해보세요
		// 숫자 2개를 나누기하되
		// 0이 들어올 수 있으니까 try로 예외처리
		
		// # 2
		// int a = sc.netxInt(); 에 대한 예외처리 (숫자를 입력해야하는 함수에 문자열을 입력할 수 있음)
		
		Scanner sc = new Scanner(System.in);
		
		MyClass1_1 mc1_1 = new MyClass1_1();
		
		
		while(true) {
			int num1 = 0;
			int num2 = 0;
			
			try{
				System.out.println("num1의 숫자을 입력하세요");
				num1 = sc.nextInt();
				System.out.println("num2의 숫자을 입력하세요");
				num2 = sc.nextInt();
			}catch(Exception str){
				System.out.println("숫자를 입력하세요");
			}
			
			try {
				mc1_1.divides(num1, num2);
			}catch(Exception ex) {
				System.out.println("오류가 발생했습니다");
				break;
			}
			
		}
			
//			// 형변환 String -> int
//			int c = 0;
//			String str = "글자";
//			try {
//				c = Integer.parseInt(str);
//				System.out.println(c);
//			}catch(Exception e){
//				System.out.println("숫자만 가능"+e);
//			}
			
	}

}
	
class MyClass1_1{
	public void divides(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
