package polymorphism;

import java.util.Scanner;

public class PolyPet {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int select = -1, type = -1;

		Dog dog_list[] = new Dog[20];
		int dog_count = 0;

		Cat cat_list[] = new Cat[20];
		int cat_count = 0;

		while (select != 0) {
			System.out.println("===메뉴===");
			System.out.println("1.추가 2.울기 3.먹기 0.종료");
			select = Integer.parseInt(sc.nextLine()); // 문자열 -> int(정수)

			if (select == 1) {
				System.out.println("0:강아지, 1:고양이 ?");
				type = Integer.parseInt(sc.nextLine()); // 추가항목 선택
				if (type == 0) {
					// 개 추가
					dog_list[dog_count++] = new Dog();
					System.out.println("강아지를 추가했습니다");
				} else if (type == 1) {
					// 고양이 추가
					cat_list[cat_count++] = new Cat();
					System.out.println("고양이를 추가했습니다");
				}
			} else if (select == 2) {
				// 울기
				for (int i = 0; i < dog_count; ++i) {
					dog_list[i].울기();
				}
				for (int i = 0; i < cat_count; ++i) {
					cat_list[i].울기();
				}
			} else if (select == 3) {
				// 먹기
				for (int i = 0; i < dog_count; ++i) {
					dog_list[i].먹기();
				}
				for (int i = 0; i < cat_count; ++i) {
					cat_list[i].먹기();
				}
			} else if (select == 0) {
				break;
			}
		}
	}
}

class Cat implements Pet { // 고양이
	public void 울기() {
		System.out.println("야옹");
	}

	public void 먹기() {
		System.out.println("츄르");
	}
}

class Dog implements Pet { // 강이지
	public void 울기() {
		System.out.println("멍멍");
	}

	public void 먹기() {
		System.out.println("개껌");
	}
}

class Bird implements Pet { // 새
	public void 울기() {
		System.out.println("짹짹");
	}

	public void 먹기() {
		System.out.println("모이");
	}
}