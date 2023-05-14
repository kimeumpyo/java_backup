package variable;

public class Var2 {
	public static void main(String[] args) {
		// 변수(프로그래밍) : 데이터값을 저장해놓는 공간 (저장공간)
		// 변수(수학) : 변할 수 있는 수 
		
		// Java가 변할 수 있기 때문에 변수에다가 저장해놓겠습니다.
		String var1 = "Java";	// var1이라는 공간을 생성하고 Java라는 데이터를 넣음
		
		System.out.println("Hello " +var1+ "!");
		System.out.println(var1+" is Simple");
		System.out.print("안녕하세요 ");
		System.out.println("반갑숩니다");
		System.out.println();
		System.out.println(var1+"를 공부합니다.");
		System.out.println(var1);   
		
		System.out.println(34-2);
		// 개발자가 32를 의도한건지, 34-2(글자) 그 자체를 의도한건지 컴퓨터는 알 수가 없음
		// 사용자의 의도를 명확하게 나타내기 위해 변수에 '자료형' 이라는 개념을 추가합니다
	}
}
