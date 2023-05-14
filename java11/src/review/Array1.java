package review;

public class Array1 {
	public static void main(String[] args) {
		// 객체화를 통해 go를 실행시키세요
		Arr1 a = new Arr1();
		a.go();
		
	}
}

class Arr1{
	public void go() {
		System.out.println("객체화를 해보세요");
		
		// 컬렉션 : 자바에서 배열의 불편함을 피라기 위해 제공해주는 클래스 (좀더 쓰디 편한 배열)
		// ArryaList, HashSet, HashMap
		
		// 배열 (같은 주제의 변수늘은 하나로 묶는다)
		String menu[] = {"라면", "김밥", "떡볶이", "순대", "", "", ""};
		int price[] = new int[7];		// 0 ~ 6
		
		price[0] = 1000;
		price[1] = 2000;
		price[2] = 3000;
		// 배열의 어려운점 : 중간에 값을 삽입하기가 쉽지않음
		price[3] = 4000;
		// 배열의 어려운점2 : 중간 값을 삭제해서 정렬하기가 쉽지 않음
		price[4] = 5000;
		price[5] = 6000;
		price[6] = 7000;
		// 배열의 어려운점3 : 크기를 늘리거나 줄이는게 쉽지 않음
		// 이런 부분을 자바에서 '자동화' 해주는 클래스가 '컬렉션'
		
		for(int i=0; i<menu.length; i++) {
			if(menu[i].equals("") || menu[i] == null) {
				menu[i] = "";
				price[i] = 0;
			}
			
			if(!menu[i].equals("") && menu[i] != null) {
				// 빈문자열이 아닌 경우만 사용
				System.out.println(menu[i]+" : "+price[i]);				
			}
		}
	}
}
