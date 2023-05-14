package polymorphism;

import java.util.Scanner;

public class PolyPet2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int select = -1, type = -1;

//		Dogs dog_list[] = new Dogs[20];
//		int dog_count = 0;
//
//		Cats cat_list[] = new Cats[20];
//		int cat_count = 0;
		
//		Birds cat_list[] = new Birds[20];
//		int Birds_count = 0;
		
		// 항목이 추가할 때마다 전반적으로 프로그램이 수정됨 ==> 다형성(틀 제공, 자료형을 통일)
		// 자료형이 통일되면 객체가 추가될 플요가 없음
		Pet pet_list[] = new Pet[60];
		int pet_count = 0;

		while (select != 0) {
			System.out.println("===메뉴===");
			System.out.println("1.추가 2.울기 3.먹기 0.종료");
			select = Integer.parseInt(sc.nextLine()); // 문자열 -> int(정수)

			if (select == 1) {
				System.out.println("0:강아지, 1:고양이, 2:새 ?");
				type = Integer.parseInt(sc.nextLine()); // 추가항목 선택
				if (type == 0) {
					// 개 추가
					pet_list[pet_count++] = new Dogs();
					System.out.println("강아지를 추가했습니다");
				} else if (type == 1) {
					// 고양이 추가
					pet_list[pet_count++] = new Cats();
					System.out.println("고양이를 추가했습니다");
				}
				else if (type == 2) {
					// 새 추가
					pet_list[pet_count++] = new Birds();
					System.out.println("새를 추가했습니다");
				}
			} else if (select == 2) {
				// 울기
				for (int i = 0; i < pet_count; ++i) {
					pet_list[i].울기();
				}
			} else if (select == 3) {
				// 먹기
				for (int i = 0; i < pet_count; ++i) {
					pet_list[i].먹기();
				}
			} else if (select == 0) {
				break;
			}
		}
	}
}

class Cats implements Pet { // 고양이
	public void 울기() {
		System.out.println("야옹");
	}

	public void 먹기() {
		System.out.println("츄르");
	}
}

class Dogs implements Pet { // 강이지
	public void 울기() {
		System.out.println("멍멍");
	}

	public void 먹기() {
		System.out.println("개껌");
	}
}

class Birds implements Pet { // 새
	public void 울기() {
		System.out.println("짹짹");
	}

	public void 먹기() {
		System.out.println("모이");
	}
}