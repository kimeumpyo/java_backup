package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBUse {
	public static void main(String[] args) {
		MyQuery mq = new MyQuery();
		// 4번 아무개 남자를 넣는다
//		mq.connect();
//		mq.insert();
//		mq.disconnect();

		// 4번 아무개 남자를 여자로 바꾼다
//		mq.connect();
//		mq.update();
//		mq.disconnect();

		// 4번 아무개 삭제
//		mq.connect();
//		mq.delete();
//		mq.disconnect();

		// 검색
//		mq.connect();
//		mq.selectAll();
//		mq.disconnect();
		
		// 1. 전체 결과를 보고 2. 아무개를 추가한다음 3. 여자로 바꿔서 4 다시 검색
		mq.connect();
		mq.selectAll();
		System.out.println("=========================");
		mq.insert();
		mq.update();
		mq.selectAll();
		mq.disconnect();
		System.out.println("=========================");
		
		// 아무개 삭제 후 다시 검색
		mq.connect();
		mq.delete();
		mq.selectAll();
		mq.disconnect();

	}
}

class MyQuery {
	// 데이터베이스는 기본적으로 읽기, 쓰기, 수정, 삭제 CRUD
	// 프로그래밍 언어에서 DataBase를 사용하기 위해서는 두가지 방법이 있음
	// Statement : 쉬움, 보안취약점
	// preparedStatement : 어려움, 보안강화

	private Connection conn;
	// static우선순위를 높이기위해 (생성자보다 먼저)
	private static final String DBID = "root";
	private static final String DBPW = "root";
	// "jdbc:mysql://아이피주소:포트번호/스키마 이름"
	private static final String DBURL = "jdbc:mariadb://127.0.0.1:3307/company"; // company 스키마랑 동일

	// 생성자 (라이브러리 로드)
	public MyQuery() {
		try {
			// mysql을 사용할경우 => "com.mysql.cj.jdbc.Driver"
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB라이브러리 로드 실패");
		}
	}

	// DB연결
	public void connect() {
		try {
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		}
	}

	// DB조회 : SELECT
	public void selectAll() {
		PreparedStatement pstmt = null; // try때문에 선언 먼저
		String sql_query = "SELECT * FROM company.employee";
		ResultSet rs = null;
		// 4. 적절하게 배치
		ArrayList<Integer> no = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> gender = new ArrayList<>();

		try {
			// 1. pstmt 에다가 sql_query 넣기
			pstmt = conn.prepareStatement(sql_query);
			// 2. ? 채우기 (필요없기때문에 생략)
			// 3. sql쿼리 전송하고 그 결과를 변수에 담는다
			rs = pstmt.executeQuery(); // 결과(정보)를 받아온다

			// ArrayList에 담기
			while (rs.next()) { // 맨 윗줄부터 하나씩
				no.add(rs.getInt(1));
				name.add(rs.getString("name"));
				gender.add(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. 정리
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 출력테스트
		for (int i = 0; i < no.size(); i++) {
			System.out.println(no.get(i) + ", " + name.get(i) + ", " + gender.get(i));
		}
	} // selectAll()

	// DB입력 : INSERT INTO 테이블명 VALUES 값;
	public void insert() {
		PreparedStatement pstmt = null; // try때문에 선언 먼저
		String sql_query = "INSERT INTO company.employee VALUES (?, ?, ?)";

		try {
			// pstmt에다가 sql_query를 넣기
			pstmt = conn.prepareStatement(sql_query);
			// ? 채우기
			pstmt.setInt(1, 4); // 첫번째 ? 에는 숫자 4를 넣는다
			pstmt.setString(2, "아무개"); // 두번째 ? 에는 문자열 '아무개' 를 넣는다
			pstmt.setString(3, "남자"); // 세번째 ? 에는 '남자' 를 넣는다
			// sql쿼리를 db서버에 전송한다
			int result = pstmt.executeUpdate();
			// 성공 여부를 판별한다
			if (result > 0) {
				System.out.println("DB입력 성공");
			} else {
				System.out.println("DB입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB입력 실패(바깥)");
		} finally {
			// pstmt 해제, DB연결 해제 (입력을 마치면 연결을 끊어준다)
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // insert()

	// DB수정 (UPDATE 테이블명 SET 내용)
	public void update() {
		PreparedStatement pstmt = null;
		String sql_query = "UPDATE company.employee SET gender=? WHERE name=?";

		try {
			// 1. pstmt 에다가 sql문자열을 담는다
			pstmt = conn.prepareStatement(sql_query);

			// 2. pstmt의 ?를 채워넣는다
			pstmt.setString(1, "여자");
			pstmt.setString(2, "아무개");
			// 3. DB로 전송한다
			int result = pstmt.executeUpdate();

			// 4.결과를 확인한다
			if (result > 0) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}

			// 5. 더이상 사용하지 않을 자원은 정리한다
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("외부 실패");
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // update()

	// DB삭제 (DELETE FROM 테이블명 WHERE 조건)
	public void delete() {
		PreparedStatement pstmt = null;
		String sql_query = "DELETE FROM company.employee WHERE name=?";

		try {
			// 1. pstmt 에다가 sql문자열을 담는다
			pstmt = conn.prepareStatement(sql_query);

			// 2. pstmt의 ?를 채워넣는다
			pstmt.setString(1, "아무개");
			// 3. DB로 전송한다
			int result = pstmt.executeUpdate();

			// 4.결과를 확인한다
			if (result > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}

			// 5. 더이상 사용하지 않을 자원은 정리한다
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("외부 실패");
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
