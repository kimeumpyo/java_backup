package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		// 1.추가 2.변경 3.삭제 4.전제보기 0.끝내기
		// 음식점 항목을 관리하는 프로그램
		// 기본메뉴 : 김밥, 떡볶이, 순대
		// 가격 : 1000, 2000, 3000
		FoodList fl = new FoodList();
		Scanner sc = new Scanner(System.in);
		String str = "";
		String after = "";
		int num = 0;
		int choice = 0;
		try {
			while (true) {
				System.out.println("1.추가 2.변경 3.삭제 4.전제보기 0.끝내기");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("추가할 음식은?");
					str = sc.next();
					System.out.println("추가한 음식의 가격은?");
					num = sc.nextInt();
					fl.addFood(str, num);
				} else if (choice == 2) {
					System.out.println("변경할 음식은?");
					str = sc.next();
					System.out.println("변경후 음식이름은?");
					after = sc.next();
					System.out.println("변경후 음식가격은?");
					num = sc.nextInt();
					fl.setFood(str, after, num);
				} else if (choice == 3) {
					System.out.println("삭제할 음식은?");
					str = sc.next();
					fl.delFood(str);
				} else if (choice == 0) {
					break;
				} else {
					fl.showAll();
				}
			}
		} catch (Exception e) {
			System.out.println("오류입니다");
		}
	}
}

class FoodList {
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();

	public FoodList() {
		name.add("김밥");
		price.add(1000);
		name.add("떡볶이");
		price.add(2000);
		name.add("순대");
		price.add(3000);
	}

	public void addFood(String str, int num) {
		name.add(str);
		price.add(num);
	}

	public void setFood(String str, String after, int num) {
		int number = name.indexOf(str);
		name.set(number, after);
		price.set(number, num);
	}

	public void delFood(String str) {
		int number = name.indexOf(str);
		name.remove(number);
		price.remove(number);
	}

	public void showAll() {
		// 전체 출력
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i) + " : " + price.get(i));
		}
	}

}