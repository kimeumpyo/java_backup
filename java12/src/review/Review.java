package review;

// import : 다른 패키지에 있는 클래스를 갖다쓰겠다
import java.util.ArrayList;

public class Review {
	public static void main(String[] args) {
		// 객체화
		MyReview mr = new MyReview();
		mr.go();
	}
}

class MyReview{
	// 멤버변수  private
	String str1;
	String str2;
	String str3;
	String str[] = new String[3];					// 고정배열
	ArrayList<String>list = new ArrayList<>();		// 동적 배열
	
	// 메서드 public
	public void go() {
		// 추가
		list.add("String1");		// ["String1"]
		list.add("String2");		// ["String1", "String2"]
		
		// 변경
		list.set(0, "String0");		// ["String0", "String2"]
		
		// 삽입
		list.add(1, "String1");		// ["String0", "String1", "String2"]
		
		// 방번호 알아내기
		int idx = list.indexOf("String1");	// String1 값이 들어있는 방번호를 return
		
		// 제거
		list.remove(1);				// ["String0", "String2"]
		
		// 조회
		list.get(0);				// String0
		
		// 전체 조회 for + size + get
		for(int i=0; i<list.size(); i++) {
			String getStr = list.get(i);
			System.out.println(getStr);
		}
		
		
		
	}
}