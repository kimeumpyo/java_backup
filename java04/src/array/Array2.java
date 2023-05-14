package array;

public class Array2 {
	public static void main(String[] args) {
		// 배열
		// 하나의 주제로 여러 변수를 묶기위해 만듦
		
		// 카페에서 커피메뉴를 전시해야한다
		String menu1 = "에스프레소";
		String menu2 = "아메리카노";
		String menu3 = "카페라떼";
//		String menu4 = "카페모카";			// 메뉴에서 제거
		String menu5 = "오렌지주스";
		
		// 일반 변수로 나열했을 때의 문제점
		// 1. 메뉴가 몇개인지 바로 알 수 없음
		// 2. 전체 출력이 불가능 (메뉴 전시를 하려면 일일히 다 써줘야함, 반복문 사용이 안됨)
		
//		for(int i=0;i<4;i++) {
//			System.out.println(menu+i); // 사용X
//		}
		
		// ==> 같은 주제로 이루어진 변수들은 '배열'이라는 문법을 통해서 '변수를 나열'을 한다
		
		String menus[] = {"에스프레소", "아메리카노", "카페라떼", "오렌지주스"};
		
		int arr_size = menus.length;		// 총 갯수를 알고싶다
		System.out.println("메뉴의 총갯수: "+arr_size);
		
		// 배열 전체 사용하는 법
		for(int i=0; i<menus.length; ++i) {
			System.out.println(menus[i]);
		}
		// 첫번째 메뉴를 보고 싶다 ==> 0번방을 출력
		// 변수명[해당 위치의 번호]
		System.out.println("=="+menus[0]+"==");
		
		menu1 = "일반변수 바꾸기";
		menus[0] = "배열요소 바꾸기";		// 배열값 바꾸기
		
		// 배열값 사용하기
		System.out.println("=="+menus[0]+"==");
		
		// 배열을 만들고 값을 채워넣고 싶다
		int nums[];
		nums = new int[3];		// nums에 정수변수 총 3개를 연결 {0번방, 1번방, 2번방}
		
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		
		
		
		
				
				
	}
}
