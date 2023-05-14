package operator;

public class Oper4 {
	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		boolean result;
		
		result = x > y;
		System.out.println("x(20) > y(10) = " + result);
		result = x < y;
		System.out.println("x(20) < y(10) = " + result);
		result = x >= y;
		System.out.println("x(20) >= y(10) = " + result);
		result = x <= y;
		System.out.println("x(20) <= y(10) = " + result);
		result = x == y;
		System.out.println("x(20) == y(10) = " + result);
		result = x != y;
		System.out.println("x(20) != y(10) = " + result);	 
	}
}	
