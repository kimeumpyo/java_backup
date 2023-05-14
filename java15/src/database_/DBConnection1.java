// 자료구조 알고리즘 멀티쓰레드 DB 네트워크(소켓)!!
package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// maria DB
//
// 사용 버전확인
// mariadb-10.11.3-winx64 설치파일
// mariadb-java-client-3.0.10-sources 설치후 
// C:\Program Files\MariaDB 10.11\lib (경로에 옮겨준다)

// eclipse로 돌아와서
// 해당 프로잭트 우클릭 -> properties -> java build Path -> Libraries -> Classpath -> add external클릭후
// C:\Program Files\MariaDB 10.11\lib 경로의 mariadb-java-client-3.0.10-.jar 을 클릭한다


public class DBConnection1 {
	public static void main(String[] args) {
		// 데이터베이스와 연결이 정상적으로 진행되는지 테스트하는 코드

		// 자바에서 '데이터베이스' 프로그램을 사용하는 법 (JDBC)
		// 1. 데이터베이스 서버를 설치한다 (시각화 workbench 포함)
		// 2. Connector 라이브러리를 설치한다 (데이터베이스마다 다름)
		// 3. 프로젝트에 추가를 한다 ( 프로젝트 속성(properties) -> Java Build Path ->
		// Livraries -> Add External jars.. -> .jar 라이브러리 파일 추가
		// HeidiSQL을 실행한다
		// 자격증명 프롬프트 : 보안 (사용할때마다 로그인을 요구한다)
		// windows 인증사용
// 확인작업
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			System.out.println("라이브러리 로드 성공!");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mariadb://127.0.0.1:3307/company","root","root");
//			System.out.println("연결 성공");
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("연결 실패");
//		}
		
		SQLConnector c = new SQLConnector();
		
	}
}

// 연결테스트
class SQLConnector {
	private Connection conn;
	// static우선순위를 높이기위해 (생성자보다 먼저)
	private static final String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://127.0.0.1:3307/company"; // company 스키마랑 동일
	
	// 생성자
	public SQLConnector() {
		try {
			System.out.println("생성자 사용");
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("마리아DB 드라이버 로딩 성공");
		} catch (Exception e) {
			System.out.println("마리아DB 드라이버 로딩 실패");
			e.printStackTrace();
		} 
	}
}
