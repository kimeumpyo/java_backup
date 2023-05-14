package iostream;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;

public class MySocketServer {
	public static void main(String[] args) {
		// 1. main 또는 시작점을 찾는다
		// 2. 위에서 부터 아래로 한줄씩 분석
		// 3. 만약 객체화 또는 함수를 만나면 그 안으로 들어가서 분석

		MyServer server = new MyServer(); // 1. 멤버변수/메서드 선언 2. 생성자 사용 3. 멤버변수 대입
		server.start(); // 4. MyServer안에 start() 함수 실행
	}
}

class MyServer extends Thread {
	// 서버소켓은 내 컴퓨터의 IP를 자동으로 가져옴
	// Port는 정해줘야함
	// 서버는 접속용 소켓 1개와 통신용 소켓 여러개를 따로 관리
	ServerSocket serverSocket; // 서버를 시작하기 위한 소켓(접속용)
	Socket socket; // 각 소켓을 관리하기 위한(개개인별)

	// 사용자의 정보와 IP를 저장할 수 있는 Map
	HashMap<String, ClientHandler> clients = new HashMap<>(); // = new HashMap<>(); 대입(객체화)

	public void run() {
		// 소켓을 연다
		try {
			serverSocket = new ServerSocket(8089); // 소켓을 연다 (서버 시작)
			while (true) {
				System.out.println("서버 시작 - 요청 대기");
				socket = serverSocket.accept(); // 클라이언트의 접속을 대기하고 들어오면 socket에 옮김
				System.out.println("접속한 클라이언트 : " + socket.getInetAddress());
				// 접속 대상자의 ip를 저장한다
				String clientIP = socket.getInetAddress().toString();
				ClientHandler existClient = clients.get(clientIP);		// 이미 있는지 체크
				
				// 새로 접속한 유저
				ClientHandler client = new ClientHandler(socket);
				clients.put(clientIP, client); // 사용자 정보 배열(Map)로 저장
				client.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ClientHandler extends Thread {
	InputStream is; // 클라이언트의 메시지를 받을 수 있게
	OutputStream os; // 클라이언트 메시지를 보낼 수 있게
	ObjectInputStream ois; // 매핑
	ObjectOutputStream oos; // 매핑
	Socket socket; // 대상자의 정보
	String clientIP; // 대상의 아이피

	public ClientHandler(Socket socket) {
		this.socket = socket;
		clientIP = socket.getInetAddress().toString();
	}
	
	

	public void run() {
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
			ois = new ObjectInputStream(is);
			oos = new ObjectOutputStream(os);

			while (true) {
				String msg = (String) ois.readObject(); // 메시지를 받음 (받을 때까지 대기함)
				System.out.println(clientIP + " 클라이언트의 메시지 : " + msg);
				oos.writeObject("서버로부터 되돌아온 메시지 : " + msg); // 클라이언트에 메시지 전송
			}
		} catch(SocketException e) {
			System.out.println("사용자가 연결을 종료했습니다" + clientIP);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try 나 catch의 수행이 끝나면 수행을 할 부분( 객체 해제)
			try {
				ois.close();
				oos.close();
				is.close();
				os.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
		
	
