package class2;

public class Method4 {
	public static void main(String[] args) {
		Myclass7 mc7 = new Myclass7();
		
		int result1 = mc7.더하기(3, 4);
		System.out.println(result1);
		
		int result2 = mc7.빼기(3, 4);
		System.out.println(result2);
		
		int result3 = mc7.곱하기(3, 4);
		System.out.println(result3);
		
		double result4 = mc7.나누기(30, 4);
		System.out.println(result4);
		
		double result5 = mc7.나누기2(222, 4);
		System.out.println(result5);
		
		int result6 = mc7.나머지구하기(10, 3);
		System.out.println(result6);
	}
}

class Myclass7 {
	// 더하기 +
	int 더하기(int num1, int num2) {	
		int result = num1 + num2;	
		return result;
	}
	// 빼기 -
	int 빼기(int num1, int num2) {	
		int result = num1 - num2;
		return result;
	}
	// 곱하기 *
	int 곱하기(int num1, int num2) {	
		int result = num1 * num2;
		return result;
	}
	// 나누기 / (0으로 나누면 결과를 0으로)
	
	// 방법1
	double 나누기(int num1, int num2) {
		double result = 0.0;
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return result;
		}else {
			result = num1 / (double)num2;	
			return result;
		}
	}
	
	// 방법2
	double 나누기2(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}else {
			double result = num1 / (double)num2;	
			return result;
		}
	}
	
	// %기호 안쓰고 나머지 구하기 만들어보기
	int 나머지구하기 (int num1, int num2) {
		int result = 0;
		// 나머지 구하기
		// 방법1
		result = num1 -((num1/num2)*num2);
		
		
//		//방법2
//		result = num1;
//		while(true) {
//			if(result < num2) {
//				break;
//			}
//			result -= num2;
//		}
		
		
		return result;
	}
	
}