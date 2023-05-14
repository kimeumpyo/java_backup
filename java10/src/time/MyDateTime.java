package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MyDateTime {
	String str1 = "멤버변수";
	static String str2 = "static정적 멤버변수";
	
	public static void main(String[] args) {
		
		MyTime mt = new MyTime();
		System.out.println(mt.dateTime());
		System.out.println(mt.date());
		System.out.println(mt.time());
		System.out.println(mt.tomorrow());
		System.out.println(mt.tomorrow2());
		System.out.println(mt.after30());
		System.out.println(mt.after50());
		
//		System.out.println(MyDateTime.str1);
//		System.out.println(); 					// 객체화를 해야 변수와 메서드를 사용가능
		System.out.println(MyDateTime.str2);	// static이어서 어느 클래스 안에 있는지만 알려주면 바로 접근가능
		
		// static으로 올려놓으면 객체화없이 그 안에 있는 메서드와 멤버변수를 바로 사용 가능
		GetInstance get = GetInstance.getInstance();		// GetInstance. : static으로 올려놔서 막 접근이 가능
		GetInstance get2 = GetInstance.getInstance();		// get==get2
		
		// getInstance() : static으로 객체화
		
		get.print();
		
		// 정석적인 객체화
//		Singleton 홍길동 = new Singleton();
//		Singleton 이순신 = new Singleton();
		
		// 싱글턴패턴의 객체화 (홍길동 == 이순신)
		Singleton 홍길동 = Singleton.getInstance();
		Singleton 이순신 = Singleton.getInstance();
		
		홍길동.setStr("홍길동입니다.");
		System.out.println(이순신.getStr());
	}
}

// 클래스
class MyTime{
	// 자바 코드로 현재 시간을 가져오는 법
	// Calendar, Date, SimpleDateFormat, String
	
	// 멤버 변수
	private String str;
	
	// 메서드
	public String dateTime() {
		// 현재 시간을 반환
		Calendar cal = Calendar.getInstance();		// 객체화(싱글턴패턴, 1회용 객체화)
		Date date = cal.getTime();					
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");		// 시간을 출력할 형태를 생성자로 결정	
		
		str = sdf.format(date);
		return str;
	}
	
	public String date() {
		// 년. 월. 일 반환
		Calendar cal = Calendar.getInstance();		// 싱글턴패턴 객체화 (시간을 가져옴)
		Date date = cal.getTime();					
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		str = sdf.format(date);
		return str;
	}
	
	public String time() {
		Calendar cal = Calendar.getInstance();		// 싱글턴패턴 객체화 (시간을 가져옴)
		Date date = cal.getTime();					
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		
		str = sdf.format(date);
		return str;
	}
	
	public String tomorrow() {
		// 내일의 년-월-일 시:분:초
		Calendar cal = Calendar.getInstance();		// 싱글턴패턴 객체화 (시간을 가져옴)
		Date date = cal.getTime();					
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("hh");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		String year = sdf1.format(date);			// 년
		String month = sdf2.format(date);			// 월
		String day = sdf3.format(date);				// 일
		String hour = sdf4.format(date);			// 시
		String minute = sdf5.format(date);			// 분
		String second = sdf6.format(date);			// 초 
		
		str = year+"년-"+month+"월-"+(Integer.parseInt(day)+1)+"일 "+
				(Integer.parseInt(hour)+1) + "시:"+minute+"분:"+second+"초";
	
		
		return str;
	}
	public String after30() {
		// 30분 뒤 시간
		Calendar cal = Calendar.getInstance();		// 싱글턴패턴 객체화
		cal.add(Calendar.MINUTE, 30);				// 분 (30분후)
		cal.add(Calendar.DAY_OF_MONTH, -3);			// 일 (3일전)
		Date date = cal.getTime();					// Date형변환
		SimpleDateFormat YMDH = new SimpleDateFormat("yyyy-MM-dd hh시");
		SimpleDateFormat M = new SimpleDateFormat("mm분");
		SimpleDateFormat S = new SimpleDateFormat("ss초");
		
		String ymdh = YMDH.format(date);			// 년 월 일 시
		String m = M.format(date);					// 분
		String s = S.format(date);					// 초
		
		str = ymdh + m + s;
				
		return str;
	}
	public String after50() {
		// 50분뒤
		Calendar cal = Calendar.getInstance();		// 싱글턴패턴 객체화
		cal.add(Calendar.MINUTE, 50);				// 분 (50분후)
		cal.add(Calendar.DAY_OF_MONTH, 6);			// 일 (6일후)
		Date date = cal.getTime();					// Date형변환
		
		SimpleDateFormat YMDHMS = new SimpleDateFormat("yyyy-MM-dd hh시mm분ss초");
		
		String ymdhms = YMDHMS.format(date);			// 년 월 일 시
		
		
		str = ymdhms;
				
		return str;
	}
	public String tomorrow2() {
		// 내일의 년-월-일 시:분:초
		Calendar cal = Calendar.getInstance();		// 싱글턴패턴 객체화 (시간을 가져옴)
		cal.add(Calendar.MINUTE, 50);				// 분 (50분후)
		cal.add(Calendar.DAY_OF_MONTH, -3);			// 일 (3일전)
		Date date = cal.getTime();					
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("hh");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		String year = sdf1.format(date);			// 년
		String month = sdf2.format(date);			// 월
		String day = sdf3.format(date);				// 일
		String hour = sdf4.format(date);			// 시
		String minute = sdf5.format(date);			// 분
		String second = sdf6.format(date);			// 초 
		
		str = year+"년-"+month+"월-"+day+"일 "+
				hour + "시:"+minute+"분:"+second+"초";
	
		
		return str;
	}


}