package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime2 {
	public static void main(String[] args) {
		MyDate md = new MyDate();
		while(true) {
			System.out.println(md.now());
			try {
				Thread.sleep(1000);  // 1초동안 프로그램 멈춤
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

class MyDate{
	// 현재 시간을 가져오기
	// oooo년 oo월 oo일 oo시 oo분 oo초
	public String now() {
		
		String str = null;
		
		Calendar cal = Calendar.getInstance();		
		Date date = cal.getTime();					
		SimpleDateFormat day = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");		// 시간을 출력할 형태를 생성자로 결정	
		String Day = day.format(date);
		
		str = day.format(date);
		return str;
	}
}
