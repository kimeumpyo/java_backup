package inter;

public class Review1 {
	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
	public Review1(int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public void printNum() {
		System.out.println(num1+num2+num3+num4);
	}
}
