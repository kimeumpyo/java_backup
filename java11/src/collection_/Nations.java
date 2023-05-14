package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Nations {
	public static void main(String[] args) {
		// 추가, 변경, 삭제, 전체보기, 끝내기
		// 항목이 있는 프로그램
		// 세계 국가 이름
		ArrayList4 arr4 = new ArrayList4();
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		String after = "";
		int choice = 0;
		
		while(true) {
			System.out.println("==항목을 선택하세요==");
			System.out.println("1.추가 2.변경 3.삭제 4.보기 0.끝내기");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("추가할 국가명은?");
				str = sc.next();
				arr4.addNation(str);
				// 국가 추가
			}else if (choice == 2) {
				//국가명을 변경
				System.out.println("변경할 국가명 : ");
				arr4.showAll();
				str = sc.next();
				System.out.println("변경후 국가명 : ");
				after = sc.next();
				arr4.setNation(str, after);
			}else if (choice == 3) {
				// 해당 국가를 삭제
				System.out.println("삭제할 국가명 : ");
				str = sc.next();
				arr4.deleteNation(str);
			}else if (choice == 0) {
				// 끝내
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}else {
				arr4.showAll();
				// 보기 (4번 또는 이상한 값을 입력하면)
			}
		}
	}
}

class ArrayList4{
	private ArrayList<String> nations = new ArrayList<>();
	
	// 생성자 (기본국가 4개)
	public ArrayList4() {
		nations.add("대한민국");
		nations.add("미국");
		nations.add("중국");
		nations.add("일본");
	}
	
	// 항목을 추가하는 함수 (add)
	public void addNation(String str) {
		nations.add(str);
	}
	// 항목을 변경하는 함수 (indexOf, set)
	// 변경하고자하는 기존 값, 변경 후의 값
	public void setNation(String prev, String after) {
		// set(방번호, 변경값) : 이전값의 방번호를 알아야함
		int number = nations.indexOf(prev);		// 이전값으 번호를 알아냄
		nations.set(number, after);				// number방번호에 있는 값을 after로 바꿈
	}
	
	// 항목을 삭제하는 함수 (indexOf, remove)
	public void deleteNation(String str) {
		// remove(방번호) : 방번호로 삭제를 하니까 입력값의 방번호를 알아내서 삭제
		int number = nations.indexOf(str);		// 입력한 문자열을 갖고있는 방번호를 찾음
		nations.remove(number);					// number에 있는 값을 삭제
	}
	
	// 젠체보기 함수 (for, size, get)
	public void showAll() {
		// 전체 출력
		for(int i=0; i<nations.size();i++) {
			System.out.println(nations.get(i));
		}
	}
}
