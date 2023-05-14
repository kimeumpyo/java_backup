package extend;

public class Ex4 {
	public static void main(String[] args) {
		스타벅스 cafe1 = new 스타벅스("본점", 300);
		cafe1.printMenu();
		
		스타벅스_강남점 cafe2 = new 스타벅스_강남점 ("강남", 600);
		cafe2.setMenu("아메리카노","딸기주스","코코아");
		cafe2.printMenu();
		
		스타벅스_부평점 cafe3 = new 스타벅스_부평점 ("부평점", 200);
		cafe3.setMenu("코코아");
//		cafe3.getMenu();
		cafe3.printMenu();
		
	}
}

// 스타벅스
class 스타벅스{
	protected String 지점명;
	protected String 메뉴[] = new String[3];
	protected int 매출;
	
	public 스타벅스 (String 지점명, int 매출) {
		this.지점명 = 지점명;
		this.매출 = 매출;
		setMenu();
	}
	public void setMenu() {
		메뉴[0] = "카푸치노";
		메뉴[1] = "카페라떼";
		메뉴[2] = "오렌지주스";
	}
	public void printMenu() {
		System.out.print(지점명+"의 메뉴판 : ");
		for(int i=0; i<메뉴.length; i++) {
			System.out.print(메뉴[i]+" ");
		}
		System.out.println();
	}
}

class 스타벅스_강남점 extends 스타벅스{
	
	public 스타벅스_강남점(String 지점명, int 매출) {
		super(지점명, 매출);	
	}
	// 오버라이딩 : 상속받은 메서드를 재정의(수정)
//	public void setMenu() {
//		메뉴[0] = "녹차라떼";
//		메뉴[1] = "아메리카노";
//		메뉴[2] = "고구마라떼";
//	}
	
	// 오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드로 취급
	public void setMenu(String menu1, String menu2, String menu3) {
		메뉴[0] = menu1;
		메뉴[1] = menu2;
		메뉴[2] = menu3;
	}
	
}

class 스타벅스_부평점 extends 스타벅스{
	
	public 스타벅스_부평점(String 지점명, int 매출) {
		super(지점명, 매출);	
	}
	public void setMenu(String menu) {
		this.메뉴[2] = menu;
	}
//	public void getMenu() {
//		메뉴[2]= "코코아";
//	}
}

// 스타벅스_부평점

// 스타벅스_강남점
