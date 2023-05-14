package class2;

public class Class3 {
	public static void main(String[] args) {
		// 아빠차, 엄마차, 내차
		Car 아빠차 = new Car();
		Car 엄마차 = new Car();
		Car 내차 = new Car();
		
		아빠차.차주 = "아빠";
		아빠차.차종 = "벤츠";
		아빠차.차색상 = "검정색";
		아빠차.차정보();
		
		엄마차.차주 = "엄마";
		엄마차.차종 = "K8";
		엄마차.차색상 = "빨강색";
		엄마차.차정보();
		
		내차.차주 = "나";
		내차.차종 = "K8";
		내차.차색상 = "검정색";
		내차.차정보();
	}
}

// class 자동차
// 데이터 : 차주인, 차종, 차색상
// 기능 : 차정보(주인이 누구인지, 차종은 무엇인지, 차색상은 무엇인지)

class Car {
	
	String 차주, 차종, 차색상;
	
	
	void 차정보() {
		System.out.println(차색상+" "+차종+" 주인은 "+차주+"입니다");
	}
}