package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream2 {
	public static void main(String[] args) {
		// File 클래스를 통해서 파일을 읽고 쓰기
		// Stream : input == 내 프로그램으로 가져온다, output == 내 프로그램에서 내보낸다
		ControlFile cf = new ControlFile();
//		cf.readFile("C:\\log\\log.txt");		// 읽는 부분
//		cf.createFile("C:\\log\\");				// 만드는 부분
//		cf.putFile("C:\\log\\log.txt");			// 쓰는 부분
//		cf.deleteFile("C:\\log\\log.txt");		// 삭제하는 부분
		MyFile1 mf = new MyFile1();
	}
}

class ControlFile {
	// FileInputStream, InputStreamReader, BufferedReader
	Scanner sc = new Scanner(System.in);

	public void readFile(String path) {
		// 텍스트 파일을 읽어서 출력
		// FileInputStream : 파일(File)에 있는 데이터를 내 프로그램으로(Stream) 가져온다(Input)
		FileInputStream fis = null; // null을 넣는 이유는 try-catch 때문

		try {
			fis = new FileInputStream(path); // byte[]
			// UTF-8 이라는 방법을 사용
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr); // byte[] -> String

			String str = null;
			// 비어있지 않다면 한줄씩 읽어 str에 저장하고 null인지 비교
			while ((str = br.readLine()) != null) {
				System.out.println(str); // 읽어왔다면 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패..");
		} catch (Exception e) {
			System.out.println("변환 실패");
		} finally {
			// try를 실행하건, catch를 실행하선 무조건 마무리 작업
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // readFile()

	// 파일 만들기 :
	public void createFile(String path) {
		System.out.println("파일명을 입력하세요>>");
		String filename = sc.next();
		File file = new File(path + filename + ".txt");

		// 해당 파일이 이미 있다면 만들지 않는다
		if (file.exists()) {
			System.out.println("이미 존재하는 파일입니다.");
			return; // return을 하는 순간 함수 즉시 종료
		}
		try {
			file.createNewFile(); // 파일 생성 코드
			System.out.println(filename + "파일을 생성했습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 입력하기 : 내 프로그램 -> 운영체제 프로그램 (OutputStream)
	public void putFile(String pathfile) {
		// try catch 를 사용하기 위해서 따로 빼준다
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(pathfile, true); // 밑줄로 넘가기려면 true를 넣어준다
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("입력할 내용>>");
		String str = sc.nextLine();
		str += '\n'; // 줄바꿈

		// 파일로 옮기기 위해선 byte단위로 바꿔야함
		byte[] byteArray = str.getBytes(); // getBytes(); => String -> byte[]
		try {
			fos.write(byteArray); // 파일에 쓰기
			System.out.println("입력 성공");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // putFile()

	// 파일 경로와 확장자를 입력하면 삭제해줌
	public void deleteFile(String _file) {
		// File(지역변수), _file(매게변수)
		File file = new File(_file);
		boolean result = file.delete();		// 파일을 삭제하는 함수

		if (result == true) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}
}

// ==================================================================

class MyFile1{
	Scanner sc = new Scanner(System.in);

	public void readfile(String strs) {
		FileInputStream inp = null;

		try {
			inp = new FileInputStream(strs);

			InputStreamReader isr = new InputStreamReader(inp, "UTF-8");
			BufferedReader br = new BufferedReader(isr); // byte[] -> String

			String str = null;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패");
		} catch (Exception e) {
			System.out.println("변환 실패");
		} finally {
			try {
				inp.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void filefound(String str) {
		System.out.println(str + "안에 있는 파일을 검색");

		// File 클래스 사용
		File file = new File(str); // 해당 경로안에 모든 파일명이 배열형태로 저장
		for (String name : file.list()) {
			System.out.println("파일: " + name);
		}
	}

	public void creatfile(String str) {
		System.out.println("생성할 파일명을 입력해주세요");
		String filename = sc.next();
		File file = new File(str + " 경로" + filename + " 이름" + "txt");

		if (file.exists()) {
			System.out.println("이미 존재하는 파일입니다.");
			return;
		}
		try {
			file.createNewFile(); // 파일 생성 코드
			System.out.println(filename + "파일을 생성했습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void putfile(String strs) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(strs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("입력할 내용을 적어주세요");
		String str = sc.nextLine();
		str += '\n';

		byte[] byteArray = str.getBytes();

		try {
			fos.write(byteArray);
			System.out.println("입력 성공");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void deletefile(String _str) {
		File file = new File(_str);
		boolean result = file.delete();

		if (result == true) {
			System.out.println("삭제완료");
		} else {
			System.out.println("삭제실패");
		}
	}
}
