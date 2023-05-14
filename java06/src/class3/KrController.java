package class3;

public class KrController {
	public static void main(String[] args) {
		KrModel km = new KrModel();
		KrModel km2 = new KrModel();
		
		km.setNum(111);
		km.setStr("안뇽");
		km2.setNum(222);
		km2.setStr("잘가");
		
		KrService ks = new KrService();		// 꾸며주기 클래스
		ks.decoEquals(km);
		ks.decoPlus(km2);
		
		KrView kv = new KrView();			// 출력 클래스
		
		kv.printNum(km);
		kv.printStr(km);
		kv.printNum(km2);
		kv.printStr(km2);
	}
}
// KrModel 클래스 (변수 : num, str / 메서드 : get, set)
class KrModel{
	int num;
	String str;
	
	void setNum(int num){
		this.num = num;
	}
	int getNum() {
		return num;
	}
	void setStr(String str) {
		this.str = str;
	}
	String getStr() {
		return str;
	}
// KrView 클래스 출력용
}
class KrView{
	void printNum(KrModel km) {
		System.out.println(km.num);
	}
	void printStr(KrModel km) {
		System.out.println(km.str);
	}
}

// krService 클래스 (자바기능)
class KrService{
	// 출력하기 전에 꾸며주기
	void decoEquals(KrModel km) {
		// 양 옆에 == 표시
		km.setStr("=="+km.getStr()+"==");		// 문자열을 가져온다음 ==을 붙여서 저장
	}
	void decoPlus(KrModel km) {
		// 양 옆에 + 표시
		km.setStr("+"+km.getStr()+"+");			// 문자열을 가져온다음 +를 붙여서 저장
//		km.str = "+" + km.str + "+";
	}
}
